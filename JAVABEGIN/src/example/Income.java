package example;

public class Income {

	public static void main(String[] args) {
		// 변수 생성
		double m = 8.62;
		double tu = 10.23;
		double w = 12.48;
		double t = 7.82;
		double f = 9.54;
		
		// 총합 계산
		double total = m + tu + w + t + f;
		
		// 총합 출력
		System.out.printf("$ %.2f", total);
	}

}
