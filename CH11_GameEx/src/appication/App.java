package appication;

import game.Game; // 클래스 불러오기 : ctrl + space or ctrl + shift + o (여러개 한거번에)

public class App {

	public static void main(String[] args) {
		// 여기부터 프로그램 시작
//		Game game = new Game();
//		game.run();
		new Game().run(); // 그냥 뉴게임 객체에 런을 실행시키기만 할 거라서 이렇게 간단하게 작성해도 됨, 대신 주소를 알지 못함
	}

}
