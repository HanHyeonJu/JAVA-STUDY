package parameter;

public class App {

	public static void main(String[] args) {
		// 매개변수(파라메터)가 있는 메소드 사용
		Calculator Cal = new Calculator();
		int number = 5;
		int result = Cal.square(number);
		
		System.out.println(result);

		result = Cal.plus(10,10);
		System.out.println(result);
		
		result = Cal.minus(10,5);
		System.out.println(result);
		
		result = Cal.multi(10,10);
		System.out.println(result);
		
	}

}
