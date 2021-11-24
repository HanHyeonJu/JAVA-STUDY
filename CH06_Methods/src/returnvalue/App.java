package returnvalue;

public class App {

	public static void main(String[] args) {
		// 리턴값이 있는 메소드 사용
		ReturnMethod r1 = new ReturnMethod();
		
//		r1.getAnimal();
        String cat = r1.getAnimal(); // r1.getAnimal()의 리턴 값을 cat에 대입함
        
        System.out.println("캣 변수는 : "+cat);

	}

}
