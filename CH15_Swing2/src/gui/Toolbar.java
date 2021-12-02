package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener{
	
	private Mainpanel mainPanel;
	private Color color;
	public ColorButtonListener(Mainpanel mainPanel, Color color) {
		this.mainPanel = mainPanel; // 변수 mainPanel은 인스턴스 변수 mainPanel이다(?)
		this.color = color;
	}// 버튼에 메인패널의 주소를 넣어줌
	
	@Override // 요거는 지워도 괜찮음
	public void actionPerformed(ActionEvent e) {
//		System.out.println("빨간색 버튼 클릭!");
		mainPanel.setBackground(color);
	}	
}

//class BlueButtonListener implements ActionListener{
//	private Mainpanel mainPanel;
//	public BlueButtonListener(Mainpanel mainPanel) {
//		this.mainPanel = mainPanel;
//	} 
//	@Override // 요거는 지워도 괜찮음
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("파란색 버튼 클릭!");
//		mainPanel.setBackground(Color.BLUE);
//	}	
//}
public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(Mainpanel mainPanel) {
		final JButton redButton = new JButton("RED"); // 변수를 생성, 버튼에 무언가를 추가하고 싶을 때 사용
		final JButton blueButton = new JButton("BLUE");
		
		//버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED)); // 마우스나 키보드를 클릭했을 때 동작해주는 이벤트 addActionListener
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));	
		
		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);		
	}

}
