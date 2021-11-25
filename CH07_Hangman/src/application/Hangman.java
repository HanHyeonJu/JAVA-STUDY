package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // 게임을 계속 진행?
	private  RandomWord word =new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 7; // 시도횟수
	private char lastGuess; // 유저입력문자
	
	// 프로그램을 실행하는 런 메소드 
	public void run() {
		do {
			displayWord(); // 화면에 단어표시(ex)_ _ _ _ _ _ _ _)
			getUserInput(); // 입력받음(철자 하나)
			checkUserInput(); // 맞는지 체크 => 맞을 시 running = false => 게임종료
		}while(running);
	}
	
   // displayWord, getUserInput, checkUserInput의 메소드를 만들어줌
	private void displayWord() {
//		System.out.println("화면에 단어 표시");
	  // 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		
		 System.out.println(word.toString());
	}
	
	private void getUserInput() {
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아서
		// RandomWord 클래스에 전달 
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자열을 guess에 저장
		// 단어에서 입력받은 문자가 있는지 확인해서 처리한다.(단어는 RandomWord 객체 word를 사용)
		word.addGuess(guess.charAt(0)); //첫번째 문자를 입력
		
	}

	private void checkUserInput() {
		//System.out.println("맞는지 체크");
		// 유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		// 게임 종료 확인을 하는 메소드 isCompleted를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word.toString());
			running = false; // 반복문 빠져나옴 => 종료
		}
	}

	/**
	 * 스캐너를 닫는 메소드*/
	public void close() {
		scanner.close();
	}

}
