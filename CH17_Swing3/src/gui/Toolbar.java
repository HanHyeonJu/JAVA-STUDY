package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JToolBar;

//class ColorButtonListener implements ActionListener{
//	
//	private Mainpanel mainPanel;
//	private Color color;
//	public ColorButtonListener(Mainpanel mainPanel, Color color) {
//		this.mainPanel = mainPanel; // ���� mainPanel�� �ν��Ͻ� ���� mainPanel�̴�(?)
//		this.color = color;
//	}// ��ư�� �����г��� �ּҸ� �־���
//	
//	@Override // ��Ŵ� ������ ������
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("������ ��ư Ŭ��!");
//		mainPanel.setBackground(color);
//	}	
//}
//
////class BlueButtonListener implements ActionListener{
////	private Mainpanel mainPanel;
////	public BlueButtonListener(Mainpanel mainPanel) {
////		this.mainPanel = mainPanel;
////	} 
////	@Override // ��Ŵ� ������ ������
////	public void actionPerformed(ActionEvent e) {
//////		System.out.println("�Ķ��� ��ư Ŭ��!");
////		mainPanel.setBackground(Color.BLUE);
////	}	
////}
public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(Mainpanel mainPanel) {
		final JButton redButton = new JButton("RED"); // ������ ����, ��ư�� ���𰡸� �߰��ϰ� ���� �� ���
		final JButton blueButton = new JButton("BLUE");
	
		//��ư�� �̺�Ʈ�� ����('Ŭ��' �̺�Ʈ)	
		redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));
		
		// �͸�Ŭ����
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.BLUE);
			}
		});
		
		// ���ٿ� ��ư�� ����
		add(redButton);
		add(blueButton);		
	}

}
