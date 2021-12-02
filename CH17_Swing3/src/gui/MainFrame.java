package gui;

import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // JFrame ������ �ø���ѹ��� �ʿ��ϱ� ������ ����, ���ϸ� ���׹߻�

	// ������
	public MainFrame(String title) {
		super(title); // ??????????????? â�� �̸��� �־ ����
		//�г� �ֱ�
		setLayout(new BorderLayout()); // â�� ǥ�õ� ���̾ƿ��� ������ (BorderLayout�� Java Swing Layout�� �� ����), â�� ������Ʈ(��ư)�� ���̱� ����
		
		final Mainpanel mainPanel = new Mainpanel(); // ������ ��ư�� �г��� �������ֱ� ���� �ּҰ� �ʿ��ؼ� �ּҸ� ������
//		mainPanel.setBackground(Color.cyan);
		
//		JPanel panel = new JPanel(); // �г� ����
//		panel.setBackground(Color.GREEN); // �� ����
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH); // ���ʿ� ���� ���̱�, �Ű������� mainPanel �ּ� ����
		add(mainPanel, BorderLayout.CENTER); // �г��� ���������ӿ� ���̱�(�߾� ��ġ), new MainPaner()�� �ּ� ���� ������ ��
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
