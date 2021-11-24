package windowprogramming;

public class App {

	public static void main(String[] args) {
		Window w = new Window();
		w.setWidth(300);
		w.setHeight(600);
		w.setIsVisible(true);
		w.setTop(200);
		w.setLeft(400);
		
		System.out.println("가로길이 : "+w.getWidth());
		System.out.println("세로길이 : "+w.getHeight());
		System.out.println("현재보임: "+w.getIsVisible());
		System.out.println("위치 top : "+w.getTop());
		System.out.println("위치 left : "+w.getLeft());
		

	}

}
