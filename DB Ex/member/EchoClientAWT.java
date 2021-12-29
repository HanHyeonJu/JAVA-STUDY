package member;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

//서버를 먼저 켜고 프레임을 작동시켜야함
public class EchoClientAWT extends MFrame
implements ActionListener{
	
	Button btn1, btn2;
	TextField tf1, tf2;
	TextArea ta;
	Panel p1, p2;
	BufferedReader in;
	PrintWriter out;
	int port = 8000;
	
	public EchoClientAWT() {
		super(350,400);
		setTitle("EchoClientAWT");
		p1 = new Panel();
		p1.add(new Label("HOST ",Label.CENTER));
		p1.add(tf1 = new TextField("127.0.0.1",25));
		p1.add(btn1 = new Button("Connect"));
		
		p2 = new Panel();
		p2.add(new Label("CHAT ",Label.CENTER));
		p2.add(tf2 = new TextField("",25));
		p2.add(btn2 = new Button("SEND"));	
		
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(p1,BorderLayout.NORTH);
		add(ta=new TextArea());
		add(p2,BorderLayout.SOUTH);
		validate();//갱신
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == tf1 || obj == btn1) {
			connect(tf1.getText().trim());
			//Connection 성공 후에 tf1, btn1은 비활성
			tf1.setEnabled(false);
			btn1.setEnabled(false);
			tf2.requestFocus();
		}else if(obj == tf2 || obj == btn2) {
			try {
				out.println(tf2.getText()); // 서버로 메시지 보냄 // 사용자가 문자열을 입력하면 서버에 갔다가 에코로 돌아오는 것(?)
				// 서버에서 보낸 문자열 ta에 append
				ta.append(in.readLine()+"\n");
				tf2.setText("");
				tf2.requestFocus();
			}catch(Exception e2) {
				e2.printStackTrace();
			}			
		}
	}
	
	public void connect(String host){
		try {
			Socket sock = new Socket(host, port);
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(), true/* auto flush */); // in out을 이용하여 클라이언트와 소켓이 네트워크를 통해서 서로
																					// 데이터를 주고받음, 소켓으로 클라이언트가 in을 통해서 스트림, 소켓이 클라이언트에게 out을 통해서 스트림
			//서버 접속 후에 최초로 받는 메시지를 ta에 append
			ta.append(in.readLine()+"\n");
			tf2.requestFocus();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoClientAWT();
	}
}





