package abstract_Class;

public class App {

	public static void main(String[] args) {
		//�߻� Ŭ����
		//GameObject obj = new GameObject(); ��ü�� ���� �� ����.
		GameObject[] objs = { new Player(), new Monster() };
		
		for(GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); // ������ �߻� �޼ҵ�
		}
	}

}
