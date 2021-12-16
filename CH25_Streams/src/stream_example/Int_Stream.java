package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// 정수형 스트림 생성
		IntStream
			.range(1, 10) // 1 ~ (10-1)까지 정수
			.skip(5) 	  // 5개 아이템 스킵(넘김) => 1~5까지가 스킵됨
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val = IntStream.range(1, 101).sum(); // int타입 변수 val에 return, 1 ~ 100까지 정수의 합
		// sum말고도 max, min, avg, count 사용가능
		System.out.println(val);
	}

}
