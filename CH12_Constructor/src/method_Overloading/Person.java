package method_Overloading;

public class Person {
	// �̸��� ���� �׸�Ʈ �޼ҵ尡 2��
	// �޼ҵ��� �Ű������� ������ Ÿ���� �ٸ��� �ٸ� �޼ҵ�� �ν�
	public void greet() {
		System.out.println("��ο�!");
	}
	
	public void greet(String name) {
		System.out.println("����! "+name);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("Ű�� ũ����!");
		}
		System.out.println("��ο�!");
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("Ű�� ũ����!");
		}
		System.out.println("��ο�!");
	}
}
