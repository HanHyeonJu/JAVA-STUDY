package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // JFrame ������ �ø���ѹ��� �ʿ��ϱ� ������ ����, ���ϸ� ���׹߻�

	// ������
	public MainFrame(String title) {
		super(title); // â�� �̸� ����
		//�г� �ֱ�
		setLayout(new BorderLayout()); // â�� ǥ���� ���̾ƿ��� ������
		add(new Mainpanel(), BorderLayout.CENTER); // �г� ���������ӿ� ���̱�(�߾� ��ġ)
		add(new Toolbar(), BorderLayout.NORTH); // ���� ���������ӿ� ���̱�(���� ��ġ)
		
		setSize(600,400); // â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
