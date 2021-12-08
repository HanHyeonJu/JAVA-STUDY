package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> numbers = new ArrayList<>();
		double total = 0; // 평균값을 구하기 위한 total변수 선언 및 초기화
		
		while(true) {
		System.out.println("숫자 또는 'q' 입력 > ");
		String input = scanner.nextLine();
		input = input.trim(); //공백제거 (공백 제거를 하지 않으면 스페이스바를 누르고 입력한 것까지 같이 출력되기 때문에 제거)		
		//System.out.println(input);
		if (input.equals("q")) { // 입력을 q로 하면 반복문 종료, equalsIgnoreCase("q")는 대소문자 상관없이라는 뜻
			break;
		}

		// q나 숫자를 입력하지 않았을 때 생기는 예외발생 처리
			try {
				double value = Double.parseDouble(input); // 문자열 => 실수로 변환 parseDouble
				numbers.add(value); // 실수로 변환된 값을 리스트에 저장
				total = total + value; // 평균값을 구해주기 위해 리스트에 입력되는 실수들을 더해준다
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}
		Collections.sort(numbers); // 정렬
		scanner.close(); // 스캐너 종료
		System.out.println(); // 한 칸 띄우기
		
		// 입력한 숫자가 아무것도 없는데 q를 입려했을 경우
		if(numbers.size() > 0) { // 입력된 숫자가 1개 이상이면 출력
			System.out.println("입력된 숫자 : "); // 반복문이 끝났을 때 출력
			for(Double n : numbers) {
				System.out.printf("%.2f\n", n);
			} // 반복문으로 숫자를 계속 입력받음
		}else {
			System.out.println("숫자를 입력받지 않음!");
		}
		
		System.out.println("평균값 : "+ total/numbers.size());
		
	}

}
