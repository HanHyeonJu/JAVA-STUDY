package throwing_runtime_exception;

public class Thermostat {
	// runtime ���ܴ� ����ó���� ���� �ʾƵ� �ȴ�.
	// runtime�� �������� ������ ������ ���� �߿��� ������ �߻���
	public void setTemperature(double temperature){ // if������ �µ��� �Է¹޾Ƽ� �µ��� 0�� �̸� �Ǵ� 35�� �ʰ��� ��� ���ܰ� �߻��ϴ� �޼���
		
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
		
		System.out.println("�µ� ���� : " + temperature);
	}
}
