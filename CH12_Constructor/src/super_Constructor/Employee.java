package super_Constructor;

public class Employee extends Person{
	public Employee() {
		super("�͸�"); //�θ� Ŭ������ ������ (�Ű������� ���ٸ� �������������� ��� ������ ������ super();�� ����� �׷��� �θ�Ŭ������ �����ڰ� ���� ��µ�
		System.out.println("Employee ������");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee ������");
	}
}
