package default_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("����Ʈ �����ڷ� ������");
		name = "��";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("person�� ������");
		this.name =name;
		age = 0;
	} // �����ڴ� �ٸ� �޼ҵ��� �ٸ��� ����Ÿ���� ���� �������� Ŭ���� �̸��� ����.
	
	public Person(String name, int age) {
		System.out.println("person�� ������");
		this.name =name;
		this.age = 0;
	}

	@Override
	public String toString() {//  ��ü�� ������ �Է�
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
