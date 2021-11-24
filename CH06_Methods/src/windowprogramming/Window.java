package windowprogramming;

public class Window {
	private int width;
	private int height;
	private boolean isVisible;
	private int top;
	private int left;
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	public void setTop(int top) {
		this.top =top;
	}
	public int getTop() {
		return top;
	}
	
	public void setLeft(int left) {
		this.left =left;
	}
	public int getLeft() {
		return left;
	}
		
}
