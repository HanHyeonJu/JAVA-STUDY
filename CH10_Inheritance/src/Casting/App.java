package Casting;

public class App {

	public static void main(String[] args) {
		//ĳ���� �ǽ�
		Cat cat1 = new HouseCat(); // ��ĳ����
		cat1.vocal();
		cat1.hunt();
		//cat1.call(); cat1�� Cat Ŭ���� Ÿ���̱� ������ Cat�� ���� �޼ҵ� ���Ұ�, �������̵��� ����
		
		//�ٿ� ĳ����
		HouseCat cat2 = (HouseCat)cat1; 
		cat2.call();
	}		
}
