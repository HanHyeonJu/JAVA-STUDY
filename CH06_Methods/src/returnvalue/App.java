package returnvalue;

public class App {

	public static void main(String[] args) {
		// ���ϰ��� �ִ� �޼ҵ� ���
		ReturnMethod r1 = new ReturnMethod();
		
//		r1.getAnimal();
        String cat = r1.getAnimal(); // r1.getAnimal()�� ���� ���� cat�� ������
        
        System.out.println("Ĺ ������ : "+cat);

	}

}
