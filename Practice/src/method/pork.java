package method;

public class pork {

	public static void main(String[] args) {
		/*���� 1�ι� ���� 180g, 1g�� Į�θ� 5.179kcal, 3�κ��� �Ҽ��� ��° �ڸ����� ���*/
		int n = 3; // ������ ��
		double x = calculate(n); // �� Į�θ�
		System.out.printf("���� %d�κ�: %.2f kcal", n, x);
	}
	
	public static double calculate(int amount) {
		int total = amount * 180;
		double totalKcal = total * 5.179;
		return totalKcal;
	}

}
