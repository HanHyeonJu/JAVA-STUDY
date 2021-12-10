package exampletotal;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수옥";
		
		// 구반자를 ","로 하는 StringTokenizer 생성
		StringTokenizer st = new StringTokenizer(str, ",");
		
		// 모든 토큰 출력
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
