package getterSetter;

public class App {

	public static void main(String[] args) {
		// �ν��Ͻ� ������ �����ϴ� get�� set
		Person p1 = new Person();
		// ���Ȼ� ��ü�� ������ �ٷ� �������� ���� - �ϳ��� ���α׷��� ��Ģ
		// p1.name = "���";
		p1.setName("���");
		System.out.println(p1.getName());
		p1.setage(7);
		System.out.println(p1.getage());
		
		Person p2 = new Person();
		
		p2.setName("�浿");
		System.out.println(p2.getName());
		p2.setage(17);
		System.out.println(p2.getage());
	}

}
