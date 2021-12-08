package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
//		(=)
		System.out.println(fox1.toString());
		System.out.printf("%x\n", fox1.hashCode()); // %x는 주소. 그냥 주소를 16진수로 변환
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		
		System.out.println(fox2.name);
		
	} // fox1과 fox2는 똑같은 객체 주소를 가진다.

}
