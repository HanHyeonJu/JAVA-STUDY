package parameter;

public class App {

	public static void main(String[] args) {
		// �Ű�����(�Ķ����)�� �ִ� �޼ҵ� ���
		Calculator Cal = new Calculator();
		int number = 5;
		int result = Cal.square(number);
		
		System.out.println(result);

		result = Cal.plus(10,10);
		System.out.println(result);
		
		result = Cal.minus(10,5);
		System.out.println(result);
		
		result = Cal.multi(10,10);
		System.out.println(result);
		
	}

}
