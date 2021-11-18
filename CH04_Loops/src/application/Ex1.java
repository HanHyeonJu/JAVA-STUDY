package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// if 예제

		System.out.println("메뉴");
		System.out.println("====");
		
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료\n");
		
		Scanner scanner =new Scanner(System.in); 
		System.out.print("옵션을 선택 > ");
		int a = scanner.nextInt();
		scanner.close();
		
		if(a == 1) {
			System.out.println("헬로우");
		}
		else if(a == 2) {
			System.out.println("안녕 ?");
		}
		else if(a == 3) {
			System.out.println("종료합니다...");
		}
		else if(a == 10000) {
			System.out.println("이스터에그를 발견했습니다.");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		}
		
		
	}

}
