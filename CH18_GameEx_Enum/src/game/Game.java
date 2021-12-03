package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;


public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = GameObject.values(); // enum의 상수들을 리턴
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	public void run(){
		System.out.println("삼세판 게임 시작...");
		int wins = 0;
//		for(GameObject ob : objects) {
//			System.out.println(ob.toString());
//		}// 테스트용

		for(int i = 1; i<=3; i++) {// i는 1부터 3까지 3번 반복
			//유저의 선택
			System.out.println("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
			GameObject ob1 = objects[scanner.nextInt()]; // 내가 입력한 가위 바위 보
			
			GameObject ob2 = objects[random.nextInt(objects.length)]; // 랜덤으로 나오는 가위 바위 보
			
			System.out.println("당신의 선택은 : " +ob1);
			System.out.println("컴퓨터 선택은 : " +ob2);
			
			// 비김, 짐, 이김 확인
			int result = ob1.compare(ob2); // ob1에 대한 ob2의 결과
			wins += result; // wins에 결과를 더해줌, 세 판이 끝났을 때의 결과를 보여줌
			if(result > 0) {
				System.out.println("당신의 승리");
			}else if (result < 0) {
				System.out.println("당신의 패배!");
			}else {
				System.out.println("비겼습니다!");
			}
			
//			int num = random.nextInt(objects.length); // 간소화시킴 
//			GameObject ob = objects[random.nextInt(objects.length)]; 
//			System.out.println(ob.toString()); // toString() 생략가능, 랜덤으로 가위 바위 보 중 하나 나오는지 테스트용
		}
		if(wins > 0) {
			System.out.println("당신의 승리~(^∇^~)");
		}else if (wins < 0) {
			System.out.println("당신의 패배('∇^*)");
		}else {
			System.out.println("비겼습니다๏_๏");
		}
	}	
}
