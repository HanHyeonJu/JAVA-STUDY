package nado;


import javax.swing.SwingUtilities;

public class Meaningless {

	public static void main(String[] args) {
		// 스윙유틸리티 활용하여 MainFrame인 JFrame 만들기
		SwingUtilities.invokeLater(() -> { // 프로그램의 안정성을 위해 넣음
			new MainFrame();
		});
	}

} // JFrame만 생성하고 나머지 요소들은 상속받은 클래스에서 구현(?)
