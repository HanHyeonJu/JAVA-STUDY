package application;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;

		while (true) { // 무한반복
			System.out.println("헬로우! " + count);

			if (count == 5) {
				break; // 반복문 종료
			}

			System.out.println("How are you.");

			count++;
		}
		
		
		System.out.println("프로그램 종료.");
	}

}
