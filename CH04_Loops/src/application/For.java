package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����){��ɹ�;}
		for(int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
		
//		for(;;) { // ���� �ݺ�
//			System.out.println("��ο�!");
//		}
		
		//1���� 100������ ��
		int sum = 0;
		
		for(int d = 1; d <= 100; d++) {
			sum = sum + d;
			// sum += d;
		}
		System.out.println("1���� 100������ �� : "+sum);
	}

}
