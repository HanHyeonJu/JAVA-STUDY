package member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class TalkServer { // 서버도 실행시켜야하니까 메인클래스 필요
	ServerSocket server;
	Vector<TalkThread> vc;
	int port = 8001;
	TalkMgr mgr;

	public TalkServer() {
		try {
			server = new ServerSocket(port);
			vc = new Vector<TalkThread>();
			mgr = new TalkMgr();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("********************************");
		System.out.println("Welcome Talk Server");
		System.out.println("클라이언트의 접속을 기다리고 있습니다");
		System.out.println("********************************");
		try {
			while (true) {
				Socket sock = server.accept();
				TalkThread client = new TalkThread(sock);
				client.start();
				// Vector에 Client 객체를 저장
				vc.addElement(client);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	} 
		
		//모든 Client에게 메시지 전달 기능
		public void sendAllMessage(String msg) {
			for(int i = 0; i < vc.size(); i++) {
				//Vector에서 Client 가져옴
				TalkThread client = vc.get(i); //Vector에서 Client 가져옴
				client.sendMessage(msg); //각가의 out스트림에 메세지 전달 
			}
		}
		
		//Client가 연결을 끊을 때 Vector에서 제거
		public void removeClient(TalkThread client) {
			vc.remove(client);
			
		}

	
	
	class TalkThread extends Thread{
		Socket sock;
		BufferedReader in; // Client가 보내는 메시지 받는 스트림
		PrintWriter out; // Client로 메세지 보내는 스트림
		
		public TalkThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				out = new PrintWriter(
						sock.getOutputStream(),true/*auto flush*/); // in out을 이용하여 클라이언트와 소켓이 네트워크를 통해서 서로 데이터를 주고받음, 소켓으로 클라이언트가 in을 통해서 스트림, 소켓이 클라이언트에게 out을 통해서 스트림
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			try {
				String data = "", id = "", pwd = "";
				while(true) { // aaa;1234로 출력되어서 잘라주어야함
					data = in.readLine();
					int idx = data.indexOf(';');
					id = data.substring(0, idx);
					pwd = data.substring(idx+1);
					if(mgr.loginChk(id, pwd)) { //--DB연동, 로그인 성공
						sendMessage("T");
						sendAllMessage("["+id+"]님이 입장하였습니다.");
						break;
					}else { //로그인 실패
						sendMessage("F");
					}
				}//--while
				//채팅
				while(true) {
					data = in.readLine();
					if(data == null) break;
					sendAllMessage("["+id+"]"+data);
				}
			}catch(Exception e) {
				removeClient(this); //자신의 객체가 Vector제거
				System.out.println(sock + "끊어짐...");
			}
			}//---run
		
		//Client로 메시지 보내는 기능
		public void sendMessage(String msg) {
			out.println(msg);
		}
	}//---TalkThread
	
	public static void main(String[] args) {
		new TalkServer();
	}
	
}
