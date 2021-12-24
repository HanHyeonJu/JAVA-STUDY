package game;

import java.util.Random;
import java.util.Scanner;

import gameobject.GameObject;
import gameobject.Paper;
import gameobject.Rock;
import gameobject.Scissors;

public class Game { // 게임 클래스에 가위, 바위, 보 객체 생성
	// 가위 바위 보 객체에 아이디를 생성하여 랜덤 숫자로 가위 바위 보를 선택할 수 있게 함(id는 gameobject 패키지에 있는 클래스들로 생성)
		GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
		Random random = new Random(); // Random 객체를 생성하여 가위 바위 보를 랜덤으로 선택할 수 있게 함
		Scanner scanner = new Scanner(System.in); //사용자가 가위 바위 보 중 하나를 입력할 수 있도록 Scanner 객체 생성
		
		public void run() {
			System.out.println("가위바위보 게임 시작합니다.");
			int wins = 0;
			
			//가위 바위 보 게임을 반복문으로 이용하여 삼세판으로 만들기
			for(int i = 1; i <= 3; i++) {
				System.out.println(i + "번째 게임 시작");
				
				GameObject ob1 = objects[scanner.nextInt()]; // 사용자가 선택한 가위 바위 보
				GameObject ob2 = objects[random.nextInt(objects.length)]; // 랜덤으로 나오는 가위 바위 보
				
				// 보기좋게 하려고 쓰는 거
				System.out.println("당신의 선택은 : "+ ob1.getName());
				System.out.println("컴퓨터의 선택은 : "+ ob2.getName()); 
				
				int score = ob1.compareTo(ob2);
				wins += score; // 변수를 설정하여 이기고 지고 비기고의 결과를 리턴받음
			}
//			for(GameObject ob : objects) {
//				System.out.println(ob); // for문을 이용해 gameobject의 toString 출력
//			}
			//int num = random.nextInt(objects.length);// objects의 배열 크기 만큼 랜덤으로 숫자 추출
			
			// 결과를 리턴받은 변수를 활용한 이프문
			if(wins > 0) {
				System.out.println("당신의 승리!");
			}else if(wins < 0) {
				System.out.println("당신의 패배!");
			}else {
				System.out.println("비겼습니다!");
			}
			
			scanner.close(); //스캐너 종료
		}
}
