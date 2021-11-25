package method;

public class pork {

	public static void main(String[] args) {
		/*삼겹살 1인문 무게 180g, 1g당 칼로리 5.179kcal, 3인분을 소수점 둘째 자리까지 출력*/
		int n = 3; // 삼겹살의 양
		double x = calculate(n); // 총 칼로리
		System.out.printf("삼겹살 %d인분: %.2f kcal", n, x);
	}
	
	public static double calculate(int amount) {
		int total = amount * 180;
		double totalKcal = total * 5.179;
		return totalKcal;
	}

}
