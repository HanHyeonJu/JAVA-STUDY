package throwing_exception;

public class Thermostat {
	// ����ó�� throws�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��(�ش� Ŭ�������� ������� �ʰ� �޼��带 ����ϴ� Ŭ������ ó���Ѵٴ� ��)
	public void setTemperature(double temperature) throws Exception { // if������ �µ��� �Է¹޾Ƽ� �µ��� 0�� �̸� �Ǵ� 35�� �ʰ��� ��� ���ܰ� �߻��ϴ� �޼���
		
		if(temperature < 0 || temperature > 35) {
			throw new Exception("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
		
		System.out.println("�µ� ���� : " + temperature);
	}
}
