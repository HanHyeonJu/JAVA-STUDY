package numbering;

public class App {
	public static void main(String[] args) {
		/*
		 * 10진수 decimal      0-9
		 * 2진수 binary 2진수  (컴퓨터) 0-1
		 * 16진수 hexadecimal  0-F
		 * 
		 * 1234567890 => 10진수
		 * 0,1,10,11,100,111,1000 => 2진수
		 * A0,FB,CD,FFF,FF00 => 16진수
		 * 
		 * 
		 * 16진수 값(리터럴)을 표시는 0x 이진수는 0b
		 */
		
		//int val = 100;  // 10진수
		//int val = 0xFF; // 16진수
		int val = 0b11111111; // 2진수
		
		System.out.println(val); // 10진수 정수로 표현
		System.out.println(Integer.toBinaryString(val)); // 2진수로 표현
		System.out.println(Integer.toHexString(val)); // 16진수로 표현
		
	}

}
