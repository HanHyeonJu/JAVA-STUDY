package method;

public class App {

	public static void main(String[] args) {
		// �ν��Ͻ� ������ ���� ���� �� �ڵ����� 0, null �ʱ�ȭ��
		
		Person p1 = new Person();
		
		System.out.println(p1.name); // �����ڷ��� String�� �� �ʱⰪ
		System.out.println(p1.age); // �⺻�ڷ��� int�� 0�ʱ�ȭ
		
		p1.sayHello(); // �޼ҵ� ȣ��
		
		p1.name = "���";
		p1.age = 7;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		p1.sayHello(); // �޼ҵ� ȣ��
		
		Person p2 = new Person();
		p2.name = "���̾�";
		
		p2.sayHello();
		
	}

}
