package throwing_exception2;

public class App {

	public static void main(String[] args) throws Exception {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// 온도 예외 발생
			//e.printStackTrace();
			System.out.println(e.getMessage()); // throw new Exception을 받아서 출력 -> 오류가 생기지 않고 예외 생성
		}
		
	}

}
