package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열
		String[][] texts = {
				{"하나", "둘", "셋"},
				{"넷", "다섯", "여섯"},
				{"일곱", "여덟", "아홉"},
		}; // 배열 3개가 texts에 들어간 거임. 첫번째[]는 배열의 개수, 두번째[]는 배열에 들어있는 값의 개수(?)
		
		for(int i = 0; i < texts.length; i++) {// 이중배열의 length는 배열의 개수를 의미함
//			System.out.printf("%d번째 배열 %s \n", i, texts[i]);
			String[] inArray = texts[i]; // 이 친구도 주석처리 하면(1)
			
			for(int j = 0; j < inArray.length; j++) {
				System.out.printf("%s \t", inArray[j]);
				// System.out.printf("%s \t", texts[i][j]); // (1)처럼 하면 요렇게 쓰면 됨
			}
			System.out.println();
		}

	}

}
