package try_catch_finally;

public class Person {
	public void setName(String name) throws Exception { // �̸��� �Է��ϴ� �޼���
		if(name == null) {
			throw new Exception("�̸��� �ΰ��� �Է��� �� �����ϴ�.");
		}
		
		System.out.println("�̸��� "+name);
	}
}
