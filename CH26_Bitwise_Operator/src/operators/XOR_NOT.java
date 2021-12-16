package operators;

public class XOR_NOT {

	public static void main(String[] args) {
		// 비트 XOR, NOT연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2; // XOR 비트 연산 : 같으면 0 다르면 1
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1)); // String.format으로 return받은 2진수 출력
		
		System.out.println();
		
		// NOT(~) 연산 : 비트가 0이면 1을 반환 1이면 0을 반환
		System.out.println(toBinary(~result1));
	}
	
	public static String toBinary(int value) { 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	} // String.format = printf처럼 사용하면서 문자열로 return한다, "%8s" = 8글자라는 의미, replace("","0") = 공백이 있으면 0으로 넣어라
}
// int는 4byte로 총 32bit, 
// 지굼 int는 1byte만 쓰고 있어서 not연산을 사용할 때 앞에 28bit가 0이어서 1으로 환산되어 출력됨
// not연산하면서 byte가 아니라 bit로 출력됨