package example;

public class Split_String {

	public static void main(String[] args) {
		/// split() 사용하여 문자열 쪼개서 배열로 리턴
		String text1 = "(CNN)As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "차 가격이 오르는 가장 큰 이유는 차를 생산하는 데 필요한 강판, 알루미늄, 마그네슘 가격이 오르고 있기 때문이다. 현대제철(004020)과 포스코(POSCO(005490))는 최근 현대차에 공급하는 자동차 강판 가격을 톤(t)당 12만원 인상한 것으로 알려졌다.";

		String[] words = text1.split("[^a-zA-Z]+"); // 정규표현식 영문철자를 제외한 특수문자 스페이스 점 슬래시같은 것들을 제외하고 단어만 리턴
		// String[] words = text2.split("[^가-힣]+"); // 한글철자만 남기기, 힣이 한글의 끝 글자

		for (String w : words) { // words안에 있는 분리된 단어들을 w에 넣어준다
			if (w.length() < 3) { // 철자가 2개 이하는 w에 저장하지 않고 계속 반복문 실행
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
	}

}
