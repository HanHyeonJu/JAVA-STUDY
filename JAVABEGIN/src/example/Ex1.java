package example;

public class Ex1 {

	public static void main(String[] args) {
		// 입력 값을 변수로 저장
		int a = 24;
		int b = 6;
		
		int c = a * b;
		int d = a / b;
		int e = a % b;
		
		
		// 결과 출력
		System.out.printf("곱하기 : %d * %d = %d\n",a, b, c);
		System.out.printf("나누기 몫 : %d / %d = %d\n",a, b, d);
		System.out.printf("나누기 나머지 : %d / %d = %d\n",a, b, e);
	}

}
