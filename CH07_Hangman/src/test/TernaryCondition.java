package test;

public class TernaryCondition {

	public static void main(String[] args) {
		// ���� ���� ������ => ���� ? A : B (if else���� �� �ٷ� ����)
		System.out.println(true ? "yes" : "no");
		System.out.println(false ? "yes" : "no");
		
		int value = 99;
		value = value > 100 ? 100 : value; // 100���� ũ�� 100 ��� �ƴϸ� value
		System.out.println(value);
		
		int[] values = {6,3,92,64,17};
		int max = 0;
		
		for(int val : values) {
//			if(val > max) {
//				max = val;
//			} // �ƽ������� val�� ũ�� val���� �ƽ��� �ִ´�.
			max = val > max ? val : max;
		}
		System.out.println(max);
		
	}
}
