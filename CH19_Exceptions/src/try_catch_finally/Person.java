package try_catch_finally;

public class Person {
	public void setName(String name) throws Exception { // 이름을 입력하는 메서드
		if(name == null) {
			throw new Exception("이름에 널값을 입력할 수 없습니다.");
		}
		
		System.out.println("이름은 "+name);
	}
}
