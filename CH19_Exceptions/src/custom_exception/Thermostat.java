package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooRowException;

public class Thermostat {
	// ����ó�� throws�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��(�ش� Ŭ�������� ������� �ʰ� �޼��带 ����ϴ� Ŭ������ ó���Ѵٴ� ��)
	public void setTemperature(double temperature) throws TempOutOfRangeException  { // if������ �µ��� �Է¹޾Ƽ� �µ��� 0�� �̸� �Ǵ� 35�� �ʰ��� ��� ���ܰ� �߻��ϴ� �޼���
	
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws TempTooHighException, TempTooRowException  {
		
		if(temperature < 0) {
			throw new TempTooRowException("�µ��� �ʹ� �����ϴ�."); // �� ���ܸ� ����
		}
		else if(temperature > 35) {
			throw new TempTooRowException("�µ��� �ʹ� �����ϴ�."); // �� ���ܸ� ����
		}
		
	}
}