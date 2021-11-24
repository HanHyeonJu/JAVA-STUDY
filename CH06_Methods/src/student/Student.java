package student;

public class Student {
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	// ������
	public Student(String name, int age) {
		isVisible = true;
		temperature = 0;
		this.name = name;
		this.age = age;
	}

	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isInVisible() {
		return isVisible;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	// toString
	public String toString() {
		return "�л� [�̸�=" + name + ", ����=" + age + ", ��ü=" + isVisible + ", �µ�=" + temperature
				+ "]";
	}
	
	
	
}
