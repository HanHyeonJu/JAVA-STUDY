package application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열 생성
		// int[] numbers = {}; 초기값을 바로 넣는 법 리터럴이라고 함
		int[] numbers = new int[3]; // 정수형 3개의 배열
		//int[] numbers; - 정수형 배열 선언
		//numbers = new int[3]; - 실제 정수형 3개의 배열을 만듬
		
		numbers[0] =99;
		numbers[1] =999;
		numbers[2] =9999;
		
		int total = 0;
		
		for(int i =0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
			total = total + numbers[i];
		}

		System.out.println("총 합계는 : "+total);
	}

}
