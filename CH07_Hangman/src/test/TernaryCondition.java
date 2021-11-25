package test;

public class TernaryCondition {

	public static void main(String[] args) {
		// 삼항 조건 연산자 => 조건 ? A : B (if else문을 한 줄로 줄임)
		System.out.println(true ? "yes" : "no");
		System.out.println(false ? "yes" : "no");
		
		int value = 99;
		value = value > 100 ? 100 : value; // 100보다 크면 100 출력 아니면 value
		System.out.println(value);
		
		int[] values = {6,3,92,64,17};
		int max = 0;
		
		for(int val : values) {
//			if(val > max) {
//				max = val;
//			} // 맥스값보다 val가 크면 val값을 맥스에 넣는다.
			max = val > max ? val : max;
		}
		System.out.println(max);
		
	}
}
