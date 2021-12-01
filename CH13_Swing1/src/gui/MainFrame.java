package gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // JFrame ������ �ø���ѹ��� �ʿ��ϱ� ������ ����, ���ϸ� ���׹߻�

	// ������
	public MainFrame(String title) {
		super(title); // ??????????????? â�� �̸��� �־ ����
		//�г� �ֱ�
		setLayout(new BorderLayout()); // â�� ǥ�õ� ���̾ƿ��� ������ (BorderLayout�� Java Swing Layout�� �� ����), â�� ������Ʈ(��ư)�� ���̱� ����
		
//		JPanel panel = new JPanel(); // �г� ����
//		panel.setBackground(Color.GREEN); // �� ����
		add(new Toolbar(), BorderLayout.NORTH); // ���ʿ� ���� ���̱�
		add(new Mainpanel(), BorderLayout.CENTER); // �г��� ���������ӿ� ���̱�(�߾� ��ġ)
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
