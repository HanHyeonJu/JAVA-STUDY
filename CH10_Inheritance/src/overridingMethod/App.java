package overridingMethod;

public class App {

	public static void main(String[] args) {
		// �޼ҵ� �������̵�		
		Cat cat1 = new Cat();
		cat1.vocal();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocal(); // ��� �޼ҵ�
		cat2.hunt(); // ��ӹ��� �޼ҵ�
		
		RoadCat cat3 = new RoadCat();
		cat3.vocal();
		cat3.hunt();
		
		Tiger cat4 = new Tiger();
		cat4.vocal();
		cat4.hunt();
	}

}
