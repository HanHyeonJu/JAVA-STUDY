package nado;


import javax.swing.SwingUtilities;

public class Meaningless {

	public static void main(String[] args) {
		// 스윙유틸리티 활용하여 MainFrame인 JFrame 만들기
		SwingUtilities.invokeLater(() -> { // 프로그램의 안정성을 위해 넣음
			new MainFrame();
		});
	}

} // JFrame을 상속받은 메인프레임 먼저 생성하고 메인프레임 객체를 생성해서 실행시킬 메인클래스를 나중에 만들어도 상관없음, JFrame객체를 만들어 놓지 않아도 상속가능
