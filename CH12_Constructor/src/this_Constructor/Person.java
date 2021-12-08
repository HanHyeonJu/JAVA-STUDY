package this_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		//this()는 생성자
		this("익명", 0);
	}
	
	public Person(String name) {
		this(name, 0);
	} 
	
	public Person(String name, int age) {
		
		this.name =name;
		this.age = age;
	}

	@Override
	public String toString() {//  객체에 정보를 입력
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
