package example;

public class Inchaes2Centimeters {

	public static void main(String[] args) {
		// 홍팍이의 허리 둘레가 32인치일 때, 이를 cm로 변환한 결과
		// 변수 생성
		int inch = 32;
		double inchToCm = 2.54;
		
		// 변환
		double cm = inch * inchToCm;
		
		// 출력
		System.out.printf("%.2fcm",cm);

	}

}
