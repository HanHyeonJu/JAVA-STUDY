package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // JFrame 에서는 시리얼넘버가 필요하기 때문에 넣음, 안하면 워닝발생

	// 생성자
	public MainFrame(String title) {
		super(title); // 창의 이름 지정
		//패널 넣기
		setLayout(new BorderLayout()); // 창에 표시할 레이아웃을 정해줌
		add(new Mainpanel(), BorderLayout.CENTER); // 패널 메인프레임에 붙이기(중앙 위치)
		add(new Toolbar(), BorderLayout.NORTH); // 툴바 메인프레임에 붙이기(위쪽 위치)
		
		setSize(600,400); // 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
