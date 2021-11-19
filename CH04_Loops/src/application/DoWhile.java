package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행됨
		/*
		int count = 0;
		System.out.println("do while 반복문");
		
		do {
			System.out.println("Count: "+count);
		}while( count++ < 5); // 비교한 다음에 증가하기 때문에 5까지 출력
	    */
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner =new Scanner(System.in); 
		
		String password = ""; // 문자열 선언과 초기값을 공백으로 둠(null)
		
		do {
			
			System.out.println("비번을 입력 > ");
			password = scanner.nextLine();
			
		}while(!password.equals(USER_PASSWORD)); // true 또는 false의 반대값
		scanner.close();
		System.out.println("접송 승인.");
	}

}
