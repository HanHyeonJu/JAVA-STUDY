package throwing_exception2;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함(해당 클래스에서 사용하지 않고 메서드를 사용하는 클래스에 처리한다는 뜻)
	public void setTemperature(double temperature) throws Exception { // if문으로 온도를 입력받아서 온도가 0도 미만 또는 35도 초과인 경우 예외가 발생하는 메서드
	
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다."); // 새 예외를 생성
		}
		
	}
}
