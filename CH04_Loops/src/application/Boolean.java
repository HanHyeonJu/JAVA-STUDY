package application;

public class Boolean {

	public static void main(String[] args) {
		// 블린 타입은 참, 거짓(true, false)
		boolean c1 = false;
		System.out.println("조건1: "+c1);
		
		// 비교 결과가 참, 거짓
		boolean c2 = 4 < 5; // 4 < 5가 조건임
		System.out.println("조건2: "+c2);
		
		//	비교 == 같을 때 참, 아니면 거짓, != 같지 않을 때 참, 아니면 거짓	
		boolean c3 = 4 != 5;
		System.out.println("조건3: "+c3);
		System.out.printf("조건3: %b", c3); //불린은 %b로 printf에 사용

	}

}
