package this_Constructor;



public class App {

	public static void main(String[] args) {
		// this ������
		Person p = new Person();
		System.out.println(p);
		
		Person p2 = new Person("���");
		System.out.println(p2);
		
		Person p3 = new Person("���̾�", 5);
		System.out.println(p3);

	}

}
