package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && || ���ļ� ���
		boolean isRaining = true; //�� ���°�?
		boolean mightRain = false; //�� �� ���� �ֳ�?
		boolean haveUmbrella = false; // ����� ������ �ֳ�
		
		if((isRaining || mightRain) && haveUmbrella){
			System.out.println("����� ����!");
		}else {
			System.out.println("����� ���� �ʴ´�.");
		}

		boolean raincheck = isRaining || mightRain;
		if(raincheck && haveUmbrella) {
			System.out.println("����� ����!");
		}else {
			System.out.println("����� ���� �ʴ´�.");
		}
	}

}
