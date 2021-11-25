package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장함
	private String str = "collection manufacturer economics painting distribution replacement percentage chocolate customer elevator cigarette foundation employment initiative operation platform leadership university strategy priority possibility election depression accident property inspector organization administration marriage teaching baseball guidance environment historian passenger philosophy engineering language relationship childhood satisfaction information permission medicine solution importance attitude politics industry complaint";
	// str에 저장된 문자열들을 words라는 배열에 리턴
	// 문자열을 스페이스로 잘라서 배열에 단어로 입력
	private String[] words = str.split(" ");

	private String selectword; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열(철자를 맞으면 저장)
	private Random random = new Random(); // ???????????????????????

	public RandomWord() {
		// 생성자에 랜덤 단어를 선택

//		selectword = words[0]; // 랜덤으로 선택되도록 수정 - >
		selectword = words[random.nextInt(words.length)];
		characters = new char[selectword.length()]; // 선택단어의 길이만큼 문자배열 크기로 생성
	}

	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
	}
	

	public String toString() {
		// 단어를_로 출력한다.
//		String text = "";
		StringBuilder sb = new StringBuilder();
		//characters[3] ='X'; //테스트
		for (char c : characters) {
//			if (c == '\u0000'){//역슬래시u000은 문자의 초기값(정수의 0, 문자열의 null), 문자의 초기값이면 아직 맞추지 못한 문자
////				text += '-';// 틀린문자
//				sb.append('_');
//			} 
//			else{
//				sb.append(c); // 맞힌문자
//			}
			sb.append(c=='\u0000'? '_' : c); // 삼항연산자를 이용한 방법
			sb.append(' '); // 철자를 한칸씩 스페이스바
			
		}
		
		//System.out.println(selectword); // 정답출력 (테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}
	
	public void addGuess(char c) {
		//넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i = 0; i < selectword.length(); i++ ) { //단어 길이만큼 반복
			if(c == selectword.charAt(i)) {
				characters[i] = c; //여기까지 하면 현재 단어를 다 맞추더라도 종료되지 않는다, 체크 대신 단어가 맞으면 종료하는 코드 필요
			}
		}
	}


}

