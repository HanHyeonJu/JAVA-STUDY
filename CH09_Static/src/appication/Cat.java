package appication;

public class Cat {
	private String name; //�̸�
	
	public static final String FOOD = "����� ���"; // ����ƽ ���(static final)
	private int id; // ���̵�(������ȣ, �ߺ��� �ȵ�)
	public static int count = 0; //����ƽ ����(��ü�鿡 ������), �ʱⰪ = 0
	
	public Cat(String name) {
		this.name =name;
		count++;
		id = count; // ��ü�� ������������� ī��Ʈ���� �����ϸ鼭 ����
	}
	
	public static int getCount() { // �� 3������ static���� �ƴϾ���
		//����ƽ �޼ҵ�� �Ϲ� �ν��Ͻ�(��ü) ���� ���Ұ�
		//String s = name;(������) ����ƽ ������ ��ü�� ������ ���� ��밡���ϹǷ� �ν��Ͻ� ������ ����� �� ����.
		
		return count; //����ƽ ������ ��밡�� 		 
	}

	@Override
	public String toString() {
		return "Cat [�̸�=" + name + ", id=" + id + "]";
	}
	
		
		

	
}
