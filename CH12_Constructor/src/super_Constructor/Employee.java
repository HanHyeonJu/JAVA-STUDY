package super_Constructor;

public class Employee extends Person{
	public Employee() {
		super("익명"); //부모 클래스의 생성자 (매개변수가 없다면 생략가능하지만 상속 받으면 무조건 super();가 생긴다 그래서 부모클래스의 생성자가 먼저 출력됨
		System.out.println("Employee 생성자");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
