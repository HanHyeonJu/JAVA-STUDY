package application;

class Person{// �ϳ��� ���Ͽ� �������� Ŭ������ ����� �ִ�.
	String name; // �ν��Ͻ� ���� : Ŭ������ ������ ����� �� ���� , ��ü�� �����Ǿ�� ��� ����

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	} // �䷸�� �ϸ� �ּ� ���� ���ϵ� ���� ����
	
}
//public String toString() {
//	String name;
//} //�䷸�� �ϸ� �ּҸ� ����



public class ClassObject {// public class�� �� ���Ͽ� �ϳ��� ��������, �����̸��� ����
						  // ���α׷��� ����Ǵ� main method�� �ִ� Ŭ����
	
	public static void main(String[] args) { // static�� ������ ������ �޸𸮿� �ö�, �����ΰ� �ƴѰ�?
		                                     // ��ü�� �������̴� ���� ���������� �� ���� ��� ������ �Ǵ� ���� ����� �д�.		
		// Ŭ������ ��ü
		// Ŭ������ ���赵 
		// ���� ��밡���� ��ü�� ���� ��ü�� ���� �޸𸮿� ������(=�ν��Ͻ�)		// ��ü�� ���� �ǹ� �ν��Ͻ��� ���� ���� �޸𸮿� ������ �� ��ü�� �ǹ�	
		
		Person p1; // ��������(String �����̱� ������) �޽� Ŭ���� Ÿ�� p1 ����, �ʱⰪ ����, Ŭ������ �ʱⰪ�� ���� �ʾƵ� ���ڿ����̸� null, �������̸� 0 ���� �ʱ�ȭ�ȴ�.	
		p1 = new Person(); // person�� ���� ��ü�� �����Ͽ� �� �ּҰ��� p1�� ����
		System.out.println(p1.toString());
		System.out.println(p1);
		p1.name = "���";
		
		Person p2 = new Person();
		p2.name = "�浿";
		Person p3 = new Person();
		p3.name = "���̿�";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		// �� ���� Ŭ���� ���赵�� ���ؼ� ����������� p1, p2, p3 �� �ٸ� ��ü���̴�.
		
	}

}
