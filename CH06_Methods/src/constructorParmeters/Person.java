package constructorParmeters;

public class Person {
	private String name;
	private double height;
	
	// ������ �޼ҵ� : public + Ŭ������(), ����Ÿ�Ծ���
	// public person(){} - �⺻������
	public Person() {
		name = "�͸�";
		height = 170;
		System.out.println("�� ����� ����!");
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
