package Casting;

public class App {

	public static void main(String[] args) {
		//캐스팅 실습
		Cat cat1 = new HouseCat(); // 업캐스팅
		cat1.vocal();
		cat1.hunt();
		//cat1.call(); cat1은 Cat 클래스 타입이기 때문에 Cat에 없는 메소드 사용불가, 오버라이딩은 가능
		
		//다운 캐스팅
		HouseCat cat2 = (HouseCat)cat1; 
		cat2.call();
	}		
}
