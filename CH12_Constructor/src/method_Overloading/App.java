package method_Overloading;

public class App {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� : �޼ҵ��� �̸��� ������ �Ű������� �ٸ� ���
		Person person = new Person();
		
		person.greet();
		person.greet("���");
		person.greet(190);
		person.greet("���̾�", 199);
		
		//�Ű������� ���� �ٸ� �޼ҵ�� ���ǵ�
		System.out.println("123"); //���ڿ�
		System.out.println(123); // ������
		System.out.println(1.23); // �����
	}

}
