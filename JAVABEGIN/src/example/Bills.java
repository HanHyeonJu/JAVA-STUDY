package example;

public class Bills {

	public static void main(String[] args) {
		// 변수 생성
		int a = 3;
		int b = 4;
		int c = 7;
		// 계산
		a *= 10000;
		b *= 5000;
		c *= 1000;
		int total = a+b+c;
		// 출력
		System.out.println(total+"원");

	}

}
