package appication;

public class App {

	public static void main(String[] args) {
		// ����ƽ ������ Ŭ������.������ ��ü �������� ���, ����ƽ�� �ƴ� ���� ��� ��ü�� �����ؾ���
		// ���а��ĵ��� �ַ� ����ƽ ������ �Ǿ�����
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(Cat.count); // ��ü�� ������ Ŭ������ ������ �޸𸮿� ����ǰ� �����(���ε� ��������)
		
		Cat cat1 = new Cat("��ƿ��");
		System.out.println(cat1.getCount());// ����ƽ ������ ��ü�� �����ȴٴ� ����
		Cat cat2 = new Cat("���̾�");
		System.out.println(cat2.getCount()); // ��ü�� ����2
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		Cat cat3 = new Cat("�����");
		System.out.println(cat3.getCount()); // ��ü�� ����3
		System.out.println(cat3.toString());
		
		System.out.println(Cat.getCount()); // getCount�� static ������ ������־��� �� ��ü �ʿ���� Ŭ���� Cat������ ������ �����ϴٴ� �� ������
	}

}
