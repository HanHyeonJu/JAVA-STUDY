package throwing_exception2;

public class App {

	public static void main(String[] args) throws Exception {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// �µ� ���� �߻�
			//e.printStackTrace();
			System.out.println(e.getMessage()); // throw new Exception�� �޾Ƽ� ��� -> ������ ������ �ʰ� ���� ����
		}
		
	}

}
