package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 뒤에 있을경우 먼저 사용하고 증감, 앞에 있을 경우 먼저 증감하고 사용		
		int x = 5;
		System.out.println(x++); // 출력이 먼저 : 5 그 다음 증가시킴
		System.out.println(x); // 증가시킨 것을 한매
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		
		int sum = x +z++; // 계산 먼저 하고 증감
		System.out.println(sum);
		
		int apples = 5;
		int bananas =4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);

	}

}
