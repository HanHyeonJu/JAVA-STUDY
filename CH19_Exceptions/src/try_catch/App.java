package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch문
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine(); // 숫자를 문자열로 입력받음
		// int line = scanner.nextInt(); // 숫자로 입력하는 것은 상관없으나 실수로 문자를 입력했을 때 비정상적으로 프로그램이 종료될 수 있기 때문에 문자열로 입력받는다.
		scanner.close();
		
		int number = 0; // int변수 선언 0으로 초기화
		boolean isNumber = false;
		
		try { // 예외가 발생할 수 있는 코드를 적용
			number = Integer.parseInt(line); 
			// 문자열을 정수로 변환, Integer 는 int를 객체형으로 쓸 수 있게 함, parseInt는 인트를 정수형으로 바꿔주는 역할
			// 숫자를 문자열로 입력 받아 정수형으로 변환하지만 문자를 입력 하면 예외가 생길 수 있어서 try-catch문을 작성해줌
			// Double.parseDouble(line); Float.parseFloat(line);  등등 으로 쓸 수 있음
			isNumber = true;
		} catch (NumberFormatException e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동 후 프로그램 끝까지 실행
			System.out.println("정수를 변환할 수 없습니다.");
		}
		
		if(isNumber) {
			System.out.println("입력한 숫자는 : " + number);
		} // 예외가 발생했을 때 숫자 0이 나오지 않게 하기 위해서 작성
	}

}
