package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// �ڹ� ���� ���α׷�
		// JFrame�� ������ â
		SwingUtilities.invokeLater(() -> { // ���α׷��� �������� ���� �ִ� �ڵ�
			new MainFrame("�׽�Ʈ ���� ��");
//			JFrame mainFrame = new JFrame(); // �� ������ â ����
//
//			mainFrame.setSize(600, 400); // ���� 600 ���� 400
//			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ����� ���α׷� ������ �� �ְ� �������
//
//			mainFrame.setVisible(true); // â�� ���̰� �ϱ�, â�� �ݴ��� ���α׷� ��� ����, �Ʒ� ������ ���� ��ư ���� ���α׷� ����
// mainframe�� �� �־���� mainframe�� �������ָ� ��
		});
	}

	}


