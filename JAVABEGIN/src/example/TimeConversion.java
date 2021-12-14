package example;

public class TimeConversion {

	public static void main(String[] args) {
		// 변수 생성, 변환
		int total = 7582;
		int hour = 7582 / (60*60);
		int min = 7582 / 60 - (hour*60);
		int sec = 7582 % 60;
		
		// 출력
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}

}
