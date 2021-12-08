package throwing_runtime_exception;

public class Thermostat {
	// runtime 예외는 예외처리를 하지 않아도 된다.
	// runtime은 문법상의 에러는 업지만 실행 중에는 에러가 발생함
	public void setTemperature(double temperature){ // if문으로 온도를 입력받아서 온도가 0도 미만 또는 35도 초과인 경우 예외가 발생하는 메서드
		
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다."); // 새 예외를 생성
		}
		
		System.out.println("온도 세팅 : " + temperature);
	}
}
