package super_Constructor;

public class Person {
	private String name;
	
	public Person(String name) {
		System.out.println("person 생성자");
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
		
}
