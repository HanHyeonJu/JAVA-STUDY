package getterSetter;

public class Person {
	// private�� ���� Ŭ���������� ���� ����
    private String name;
	private int age;
	
	// public�� �ٸ� Ŭ�������� �� �� ����
	// set�� ���� �Է��ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name; // �̶� this�� �ν��Ͻ� �ǹ�
	}
	
	// get�޼ҵ�� ���� �����ϴ� �޼ҵ�
	public String getName() {
		System.out.println(this);
		return name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	public int getage() {
		System.out.println(this);
		return age;
	}
	
}
