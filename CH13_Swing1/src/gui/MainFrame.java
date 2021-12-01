package gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // JFrame 에서는 시리얼넘버가 필요하기 때문에 넣음, 안하면 워닝발생

	// 생성자
	public MainFrame(String title) {
		super(title); // ??????????????? 창의 이름을 넣어서 생성
		//패널 넣기
		setLayout(new BorderLayout()); // 창에 표시될 레이아웃을 정해줌 (BorderLayout은 Java Swing Layout의 한 종류), 창에 컴포넌트(버튼)을 붙이기 위함
		
//		JPanel panel = new JPanel(); // 패널 생성
//		panel.setBackground(Color.GREEN); // 색 설정
		add(new Toolbar(), BorderLayout.NORTH); // 위쪽에 툴바 붙이기
		add(new Mainpanel(), BorderLayout.CENTER); // 패널을 메인프레임에 붙이기(중앙 위치)
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
