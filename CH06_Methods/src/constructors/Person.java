package constructors;

public class Person {
	private String name;
	private double height;
	
	// ������ �޼ҵ� : public + Ŭ������(), ����Ÿ�Ծ���
	// public person(){} - �⺻������(�Ű������� ���� ��)
	public Person() {
		name = "�͸�";
		height = 170;
		System.out.println("�� ����� ����!");
	}

	public Person(String name, double height) {
		this.name =name;
		this.height =height;
		System.out.println("�� ����� ����!");
	}
	//toString �޼ҵ�
	public String toString() {
//		String text =" �̸� : "+name+", Ű : "+height;
//		return text;
		return " �̸� : "+name+", Ű : "+height;
	}
	
	// get set �޼ҵ�
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
