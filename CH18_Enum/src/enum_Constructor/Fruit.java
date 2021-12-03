package enum_Constructor;

public enum Fruit { // Ű���忡 ���� class�� �ǰ� enum�� �ȴ�.
	APPLE("�ʷϻ�"), BANANA("�����"), ORANGE("��������"); // ������� ����
	
	private String color;
	
	Fruit(String color) { // enum�� ������
		this.color = color; // (="@@��")
	}
	
	public String toString() {
		return super.toString().toLowerCase()+"("+color+")"; // super�� enum�� toString�� ����? super�� enum Fruit�� �ǹ��ϳ�?, tolowerCase()�� �ҹ��ڷ� ��½�Ŵ
	}
}
