package overridingMethod;

public class HouseCat extends Cat {
	@Override // ������̼� - �������̵� �ƴٰ� ǥ������ ��
	public void vocal() { // �������̵� �޼ҵ�(����Ŭ������ �ִ� �޼ҵ带 ����Ŭ�������� ���� ��)
		System.out.println("�̾߿�~");
	}
}
