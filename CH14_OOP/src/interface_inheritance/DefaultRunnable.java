package interface_inheritance;

public interface DefaultRunnable extends Runnable{
	default void displayDetails() { // default가 붙으면 메소드 구현가능
		System.out.println("표시할 디테일없음");
	};
}
