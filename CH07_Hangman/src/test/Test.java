package test; // 테스트용 패키지

import java.util.Random;

public class Test { 
	public static void main(String[] args) {
//		RandomWord r = new RandomWord();
//		r.getWords();
//		System.out.println(r.toString());
		Random random = new Random();
		
		String[] words = {"펭수","고양이","라이언","늑대","소"};
		for(int i =0; i<100; i++) {//이 for문을 적은 이유?
			int randomIndex = random.nextInt(words.length); // 0~ (배열갯수-1)까지 랜덤으로 출력
			System.out.println(words[randomIndex]);
		}
	}
}
