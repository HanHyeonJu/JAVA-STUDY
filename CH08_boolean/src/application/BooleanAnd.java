package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A,B ��� ���϶��� ��
		boolean isRaining = false; // �� ���°�? true true
		boolean haveUmbrella = true; // ����� ������ �ֳ�? true false
		
		boolean takeUmbrella = false; // ����� ����? true false
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("ù��° : "+ takeUmbrella);
		
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("�ι�° : "+takeUmbrella);
		
		//3
		takeUmbrella = isRaining && haveUmbrella ? true: false;
		System.out.println("����° : "+takeUmbrella);
	}

}