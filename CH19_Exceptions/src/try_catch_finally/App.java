package try_catch_finally;

public class App {

	public static void main(String[] args){
		Person p1 = new Person();
		
		try {
			p1.setName("코코"); // 예외 발생시 여기는 실행 안됨
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//여기는 예외가 발생하든 안하든 무조건 실행됨
			System.out.println("final 무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
