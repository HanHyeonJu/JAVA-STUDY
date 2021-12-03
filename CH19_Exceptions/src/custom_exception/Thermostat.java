package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooRowException;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함(해당 클래스에서 사용하지 않고 메서드를 사용하는 클래스에 처리한다는 뜻)
	public void setTemperature(double temperature) throws TempOutOfRangeException  { // if문으로 온도를 입력받아서 온도가 0도 미만 또는 35도 초과인 경우 예외가 발생하는 메서드
	
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws TempTooHighException, TempTooRowException  {
		
		if(temperature < 0) {
			throw new TempTooRowException("온도가 너무 낮습니다."); // 새 예외를 생성
		}
		else if(temperature > 35) {
			throw new TempTooRowException("온도가 너무 높습니다."); // 새 예외를 생성
		}
		
	}
}