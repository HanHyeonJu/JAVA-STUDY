package application;

public class NewArray {

	public static void main(String[] args) {
		// new Ű����� �迭 ����
		// int[] numbers = {}; �ʱⰪ�� �ٷ� �ִ� �� ���ͷ��̶�� ��
		int[] numbers = new int[3]; // ������ 3���� �迭
		//int[] numbers; - ������ �迭 ����
		//numbers = new int[3]; - ���� ������ 3���� �迭�� ����
		
		numbers[0] =99;
		numbers[1] =999;
		numbers[2] =9999;
		
		int total = 0;
		
		for(int i =0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
			total = total + numbers[i];
		}

		System.out.println("�� �հ�� : "+total);
	}

}
