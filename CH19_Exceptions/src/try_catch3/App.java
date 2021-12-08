package try_catch3;

import java.util.Scanner;

public class App {

	private static Scanner scanner=new Scanner(System.in); // static 메서드에서 사용 할 것이기 때문에 static 붙여줌

	public static void main(String[] args) {
		
		int number = getNumber(); // 메서드를 이용해서 입력받기
		System.out.println("입력한 숫자는 : "+ number);
		scanner.close(); // 스캐너 종료
		

	}
	
	private static int getNumber() {// 숫자를 입력받아서 리턴헤주기 위한 메서드
		int number = 0;
		boolean isNumber= false;
		
		// 숫자를 입력할때까지 반복 do while문 사용
		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();	
			
			// 예외를 처리하는 try-catch문
			try {
				number = Integer.parseInt(line); 
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("정수를 변환할 수 없습니다.");
			}
			
		}while(!isNumber); //inNumber가 true면 종료
		
		return number; // 숫자를 입력받아 리턴해줌

}

}
