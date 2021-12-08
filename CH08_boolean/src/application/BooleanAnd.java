package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A,B 모두 참일때만 참
		boolean isRaining = false; // 비가 오는가? true true
		boolean haveUmbrella = true; // 우산을 가지고 있나? true false
		
		boolean takeUmbrella = false; // 우산을 쓰나? true false
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : "+ takeUmbrella);
		
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("두번째 : "+takeUmbrella);
		
		//3
		takeUmbrella = isRaining && haveUmbrella ? true: false;
		System.out.println("세번째 : "+takeUmbrella);
	}

}
