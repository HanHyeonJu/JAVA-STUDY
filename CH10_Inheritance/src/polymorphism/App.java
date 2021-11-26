package polymorphism;

public class App {

	public static void main(String[] args) {
		// ������ : �ڽ� Ŭ���� Ÿ���� �θ� Ÿ������ �� ��ȯ	
//		Cat cat1 = new Cat();
//		Cat cat2 = new HouseCat(); //Ŭ������ �θ� Ŭ������ �ٲپ ���������� �۵����� ������
//		Cat cat3 = new RoadCat();
//
//		Cat[] cats = { cat1, cat2, cat3, cat4};
//		
//		for each �ݺ���
//		for(Cat c :cats) {// cats�迭�� ������ ��ü�� c�� �����Ͽ� �ݺ�
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats = { new Cat(), new HouseCat(), new RoadCat(), new Tiger() };
		// cats[0] == new Cat(); 
		// cats[1] == new Cat(); 
		// cats[2] == new Cat(); 
		// cats[3] == new Cat(); 
		
		// for �ݺ���
		for(int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		// for each �ݺ���
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// ĳ���� ����ȯ ( �⺻ ������ Ÿ��)
//		int a = 1.2345; // ������ ����
		int b = (int)1.2345; // ĳ����, ��ȯ�� ���������� ������ �߸�
		System.out.println(b);
		
		// ������ Ÿ��(������ : Ŭ������ �迭 ���� ��) ĳ����
		// ����̳� ���� ���迡���� ����
		Cat cat1 = new HouseCat(); // ��ĳ����
		HouseCat cat2 = (HouseCat)cat1; //�ٿ�ĳ����
		
	}		
}
