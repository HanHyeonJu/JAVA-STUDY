package Casting;

public class HouseCat extends Cat {
	@Override // ������̼� - �������̵� �ƴٰ� ǥ������ ��
	public void vocal() { // �������̵� �޼ҵ�(����Ŭ������ �ִ� �޼ҵ带 ����Ŭ�������� ���� ��)
		System.out.println("�̾߿�~");
	}
	public void call(){ // �Ͽ콺Ĺ�� ���� �޼ҵ�
		System.out.println("���縦 �θ���~");
	}
}
