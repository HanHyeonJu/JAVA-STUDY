package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
		for(int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
//		for(;;) { // 무한 반복
//			System.out.println("헬로우!");
//		}
		
		//1에서 100까지의 합
		int sum = 0;
		
		for(int d = 1; d <= 100; d++) {
			sum = sum + d;
			// sum += d;
		}
		System.out.println("1부터 100까지의 합 : "+sum);
	}

}
