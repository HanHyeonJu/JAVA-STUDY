package student;

public class App {

	public static void main(String[] args) {
		// ���� Ŭ���� ������� 1. ���� 2. ������ 3. ���ͼ��� 4. toString
		// 2~4������ �ڵ��ϼ�(������ ���콺 -> �ҽ� -> ���ʷ���Ʈ��¼����¼��)
		
		Student s1 = new Student("���",7);
		Student s2 = new Student("�浿",37);
		Student s3 = new Student("���̾�",17);
		Student s4 = new Student("������",27);
		
		s1.setIsVisible(false); // ����� ����, �µ����� ����
		s2.setTemperature(35.5); // �浿�� ��ü, �µ� 35.5
		s3.setTemperature(37.5); // ���̾��� ��ü, �µ� 37.5
		s4.setIsVisible(false); // �����µ� ����
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
