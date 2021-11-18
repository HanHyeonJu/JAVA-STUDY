package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		//스캐너
		Scanner scanner =new Scanner(System.in); 
		
		System.out.print("사과의 갯수는?");
		int apple = scanner.nextInt();
		
		System.out.print("바나나의 갯수는?");
		int banana = scanner.nextInt();
		scanner.close(); // 스캐너를 더 이상 쓰지 않을 때는 종료 시켜줘야 함
		
		if(apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		if(banana > apple) {
			System.out.println("바나나가 사과보다 많음");
		}
		System.out.println("프로그램 종료.");

		// IF 조건문
//		int apple = 5;
//		int banana = 10;
//		
//		// if의 조건이 참일 경우에 {}안의 명령문을 실행한다		
//		if(apple > banana) {
//			System.out.println("사과가 바나나보다 많음");
//		}
//		System.out.println("프로그램 종료.");
//		
//		워닝이 있어도 프로그램 실행은 가능함
	}

}
