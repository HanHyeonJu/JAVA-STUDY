package molla;
// ����ü
public abstract class Creature { // �߻�Ŭ����
	private int x;
	private int y;
	private int age; // �⺻������ ����ü�� ���� ��ҷ� ��ġ x, y �׸��� age�� �ʿ��ϴٰ� ������ ����
	
	public Creature(int x, int y, int age) { // ����ü Ŭ������ �⺻ ������
		this.age = age;
		this.x= x;
		this.y =y;
	} 
	
	// �����ڰ� ������� �� 3���� ��Ҵ� �޾Ƽ� ���� �� �ֵ��� ��
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void age() {
		age++;
	}
	
	public void move(int xDistance) {
		x += xDistance;
	}
	// ���̸� �԰� x ��ǥ������ �̵��� �� �ִٴ� ����ü�� ������ ���/ ����Ŭ������ ����� �� �ֵ��� �Ϲ� �޼���� ����
	
	public abstract void attack();
	public abstract void printInfo();
	// ��� ����ü���� �ʿ��� ��������� ����ü���� �ٸ� ������� �����ϱ� ������ �߻�޼���� ����
	
	
	// ����� �����ϰ� �ϱ� ���� �������̵���
	@Override
	public String toString() {
		return "Creature [x=" + x + ", y=" + y + ", age=" + age + "]";
	}

	

}
