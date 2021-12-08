package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in); 
		
		System.out.print("사과의 갯수는?");
		int apple = scanner.nextInt();
		
		System.out.print("바나나의 갯수는?");
		int banana = scanner.nextInt();
		scanner.close(); // 스캐너를 더 이상 쓰지 않을 때는 종료 시켜줘야 함
		
		if(apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if(apple < banana){ // 또 다른 조건은 else if(조건)을 사용한다. (여러 개 사용가능)
			System.out.println("바나나가 사과보다 많음");
		}
		else { // 위의 조건들이 아닐 경우 실행
			System.out.println("바나나와 사과의 개수가 같음");
		}
		System.out.println("프로그램 종료.");
	}

}
