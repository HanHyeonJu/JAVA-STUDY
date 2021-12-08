package returnvalue;

public class ReturnMethod {
//	void getAnimal() {
//		System.out.println("고양이를 리턴합니다.");
//	}
	
	String getAnimal() { //() <- 요 안에 들어가는게 매개변수
		System.out.println("고양이를 리턴합니다.");
		return "고양이";
	}
	
}
