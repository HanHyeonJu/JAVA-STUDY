package windowprogramming;

public class App {

	public static void main(String[] args) {
		Window w = new Window();
		w.setWidth(300);
		w.setHeight(600);
		w.setIsVisible(true);
		w.setTop(200);
		w.setLeft(400);
		
		System.out.println("���α��� : "+w.getWidth());
		System.out.println("���α��� : "+w.getHeight());
		System.out.println("���纸��: "+w.getIsVisible());
		System.out.println("��ġ top : "+w.getTop());
		System.out.println("��ġ left : "+w.getLeft());
		

	}

}
