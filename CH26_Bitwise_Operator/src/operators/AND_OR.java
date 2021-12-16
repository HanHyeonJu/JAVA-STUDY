package operators;

public class AND_OR {

	public static void main(String[] args) {
		// 비트 and or 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 & v2; // and 비트 연산(논리연산아님(?)) // 논리연산이면 v1, v2가 아니라 boolean값이어야함
		System.out.println(result1); // 10진수로 표현됨
		
		System.out.println();
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1)); // String.format으로 return받은 2진수 출력
		
		System.out.println();
		
		int result2 = v1 | v2; //or 비트연산
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result2));
	}
	
	public static String toBinary(int value) { 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	} // String.format = printf처럼 사용하면서 문자열로 return한다, "%8s" = 8글자라는 의미, replace("","0") = 공백이 있으면 0으로 넣어라
}
