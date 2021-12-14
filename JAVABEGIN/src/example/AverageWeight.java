package example;

public class AverageWeight {

	public static void main(String[] args) {
		// 변수 생성
		// 홍팍이의 1~3월 몸무게의 평균
		double F = 81.36;
		double S = F + 0.71;
		double T = S - 0.43;
		// 계산
		double average = (F+S+T) / 3;
		// 출력
		System.out.printf("%.2fkg", average);
	}

}
