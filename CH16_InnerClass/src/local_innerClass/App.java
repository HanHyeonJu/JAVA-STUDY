//�޼ҵ� ���� �̳�Ŭ���� : �޼ҵ� ���� Ŭ����
package local_innerClass;

public class App {
	private String name; // �ν��Ͻ� ����, ��ü�� �����ؾ� �����
	
	public App() {
		name = "�ٸ��ں���"; // �⺻�����ڿ� ��ü ����
	}
	
	public static void main(String[] args) {
//		System.out.println(name); // static �޼ҵ忡���� �ν��Ͻ� ��� �Ұ� static�� ��ü�� �������� ����
		App app = new App(); 
//		app.name = "���";
		app.run();
	}

	private void run() { // name�� ����ϱ� ���� �޼ҵ�
		System.out.println(name);
		// Ŭ���� ���� �޼ҵ忡 Ŭ����
		class Printer{
			public void print() {
				System.out.println(name); // ����Ŭ������ ����Ŭ������ ������ ��밡��
			}
		}
		
//		Printer p = new Printer();
//		p.print();
//		(=)
		new Printer().print(); 
	}
}
