package application;

import java.util.Scanner;

public class IfElse {

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
		else { // 위의 if문의 조건이 아닐 경우 실행
			System.out.println("바나나가 사과보다 많음");
		}
		System.out.println("프로그램 종료.");
	}

}
