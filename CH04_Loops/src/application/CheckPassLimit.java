package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문 빠져나옴
		// 3회 틀릴시 '접속거부'
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		
		boolean accessOK = false; // 플래그(flag): 불린변수로 상태에 따라 처리흐름 제어
		
		
		
		for(int i = 1; i <=3; i++) {
			System.out.println("Enter password > ");
			String password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("접속 승인");
				accessOK = true;
				break;
			}
			else {
				System.out.printf("비번이 틀렸습니다 (%d)\n", i);
//				System.out.printf("비번에 %d번 틀렸습니다.\n", i +1);
			}
		}
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}// 3번 실패한게 false인거니까 false인게 true니까 그래서 접속거부가 출력된다.
		
	}
}
