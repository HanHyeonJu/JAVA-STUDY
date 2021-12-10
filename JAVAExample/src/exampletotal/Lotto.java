package exampletotal;

import java.util.Random;

class LottoMachine {
	private int[] LottoNumbers;

	public LottoMachine() {
		// 2. 메소드를 이용해서 로또번호 생성 초기화
		LottoNumbers = generate();
	}

	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		// 1. 임의의 숫자 6개 추출

		for (int i = 0; i < 6; i++) {
			pickedNumbers[i] = rand.nextInt(45) + 1;
		}

		return pickedNumbers;
	}

	// 3. 생성된 로또번호를 가져오는 get 메소드
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}

}

public class Lotto {

	public static void main(String[] args) {
		// 로또번호 생성기
		/*
		 * 로또는 1~45 사이의 정수 중 중복되지 않는 6개의 숫자를 정하여 이를 맞추면 상금을 타게 된다. 
		 * 6개의 로또 번호를 자동 생성하도록 주어진 코드를 완성하시오
		 * 
		 */
		
		// 객체 생성(로또머신의 객체)
		LottoMachine machine = new LottoMachine();
		
		// 로또번호 가져오기
		int[] numbers = machine.getLottoNumbers(); // 변수 machine에 저장 된 객체 LottoNumbers를 가져옴
		
		//결과 출력
		System.out.println("생성 번호: ");
		for(int i : numbers) {
			System.out.printf("%d ",i);
		}

	}

}
