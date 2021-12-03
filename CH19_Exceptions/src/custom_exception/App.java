package custom_exception;



import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooRowException;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-36);
		} catch (TempTooHighException e) {
			// 온도가 높을 때
			System.out.println(e.getMessage()); 
		} catch (TempTooRowException e) {
			// 온도가 낮을 때
			System.out.println(e.getMessage());
		}
		
	}

}
