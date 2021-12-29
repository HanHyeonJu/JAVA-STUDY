package member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	// java.io, java.net, java.sql은 대부분 예외가능 가능성 있는 생성자 또는 메소드 : try-catch
		public EchoServer() {
			try {
				int port = 8000;
				int cnt = 0; // 클라이언트 접속 수
				ServerSocket server = new ServerSocket(port); // ServerSocket은 port필수 , *port번호는 한 번만 실행되므로 두 번 실행하면 오류남
				System.out.println("ServerSocket Start.....");
				while(true) {
					//Client가 접속할 때 까지 대기상태
					Socket sock = server.accept(); // 대기, 계속해서 실행이 되는 것이 아니라 클라이언트가 접속해야 실행될 수 있게 함(양방향 스트림(?)), 클라이언트에도 소켓이 있고 서버에도 소켓이 있음 단 서버는 클라이언트가 요청(접속)을 해야 소켓이 생성됨 
					EchoThread client = new EchoThread(sock); // 클라이언트에 대한 대응
					client.start(); // run 호출
					cnt++;
					System.out.println("Client " + cnt + " Socket");
				} // 클라이언트가 접속할 때 마다 계속 반복
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//내부클래스로 Client의 대응을 각각 하기 위해 Thread 기능의 클래스 생성
		// 스트림 : 바이트 단위의 데이터를 단방향으로 받음(?)
		class EchoThread extends Thread{
			Socket sock;
			BufferedReader in; // Client가 보내는 메시지 받는 스트림
			PrintWriter out; // Client로 메세지 보내는 스트림
			
			public EchoThread(Socket sock) {
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
					// Client가 접속하면 처음으로 받는 메시지
					out.println("Hello! Enter BYB to exit");
					while (true) {
						// Client가 메시지 보낼 때까지 대기 상태
						String line = in.readLine();
						if (line == null/* 클라이언트가 일방적으로 접속을 끊었을 때 */) {
							break;
						} else {
							out.println("Echo : " + line); // 이 때 라인은 클라이언트가 입력한 글인가?
							if (line.equals("BYB")) {
								break;
							}
						}
					}//---while
				} catch (Exception e) {
					e.printStackTrace();
				}//---run
			}
		}// --EchoThread
		
		public static void main(String[] args) {
			new EchoServer();
		}
}
