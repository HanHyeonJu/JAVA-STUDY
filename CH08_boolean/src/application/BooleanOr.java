package application;

public class BooleanOr {

	public static void main(String[] args) {
		//or, A||B => ���߿� �ϳ��� ���̸� ��
		boolean isRaining = false; // �� ���°�? 
		boolean mightRain = true; // �� �ü��� �ֳ�? 	
		boolean takeUmbrella = false; // ����� ����? 
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);

	}

}
