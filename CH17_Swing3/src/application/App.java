package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// 자바 스윙 프로그램
		// JFrame은 윈도우 창
		SwingUtilities.invokeLater(() -> { // 프로그램의 안전성을 위해 넣는 코드
			new MainFrame("테스트 스윙 앱");
//			JFrame mainFrame = new JFrame(); // 새 윈도우 창 생성
//
//			mainFrame.setSize(600, 400); // 가로 600 세로 400
//			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 종료시 프로그램 종료할 수 있게 만들어줌
//
//			mainFrame.setVisible(true); // 창을 보이게 하기, 창을 닫더라도 프로그램 계속 실행, 아래 오른쪽 빨간 버튼 눌러 프로그램 종료
// mainframe에 다 넣어놔서 mainframe만 생성해주면 됨
		});
	}

	}


