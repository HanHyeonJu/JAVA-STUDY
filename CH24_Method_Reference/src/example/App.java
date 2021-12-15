package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void greet() { // static 메소드는 객체 생성없이 사용 가능
		System.out.println("헬로우!");
	}
	
	public static void main(String[] args) {
		// 메소드 레퍼런스
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		//service.scheduleAtFixedRate(() -> {}, 0, 1000, TimeUnit.MILLISECONDS); // runnable인터페이스는 매개변수도 리턴값도 없으므로 람다식으로 저렇게 표현해서 사용 가능
								// 클래스명::메소드명(static메소드가 꼭 있어야 함)
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS); //람다식말고 메소드를 사용할 때, 1초에 한 번씩 출력
		// 람다식과 메소드 레퍼런스 둘 중 하나만 사용하면 되는데 주로 람다식 사용하는게 편함
	}

}
