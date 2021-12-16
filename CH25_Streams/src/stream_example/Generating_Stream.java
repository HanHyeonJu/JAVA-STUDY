package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Stream.of = range와 비슷한 역할
		Stream.of(1,2,3).forEach(n -> System.out.println(n));
		Stream.of("하나","둘","셋").forEach(s -> System.out.println(s));
		
		System.out.println();
		// generate메소드는 ( )안의 리턴 결과로 스트림을 생성, 이 때 무한대로 생성하므로 갯수를 제한
		Stream.generate(()->"헬로우").limit(5).forEach(g -> System.out.println(g));
	}
}
