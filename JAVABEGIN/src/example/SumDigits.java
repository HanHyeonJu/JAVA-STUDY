package example;

public class SumDigits {

	public static void main(String[] args) {
		// 변수 생성
		int num = 374;
		int one = num % 5;
		int two = num / 53;
		int thr = (num % 370)-1;
		
		// 계산
		int tnum = one + two+ thr;
		
		// 출력
		System.out.println("총합: "+tnum);
	}

}
