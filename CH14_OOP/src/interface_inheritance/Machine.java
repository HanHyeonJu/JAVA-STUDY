package interface_inheritance;

public class Machine implements DefaultRunnable {

	@Override
	public void run() { // run은 runnable 인터페이스의 추상메소드
		System.out.println("머신 러닝!");
	}

//	@Override
//	public void displayDetails() {
//		System.out.println("표시할 디테일없음");
//	}
//	
}
