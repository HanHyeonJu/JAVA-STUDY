package interfaces;

public class App {

	public static void main(String[] args) {
		// �������̽�
//		Describable ds = new Describable(); ��ü�� ���� �� ����.
		
//		Object[] objs = { new Person(), new Computer() }; // Object�� ��� Ŭ������ �θ� Ŭ������ �䷸�� ����� ���� ����
		Describable[] objs = { new Person(), new Computer() };
		
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
		}

	}

}
