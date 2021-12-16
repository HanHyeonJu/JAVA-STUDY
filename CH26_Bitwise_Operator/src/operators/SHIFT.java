package operators;

public class SHIFT {

	public static void main(String[] args) {
		// 비트 shift >>. << 연산
		int value = 0b00010001;
		System.out.println(toBinary(value));
		
		int result1 = value << 3;
		System.out.println(toBinary(result1)); // 왼족으로 이동함
		
		int result2 = result1 >> 3;
		System.out.println(toBinary(result2)); // 오른쪽으로 이동함
		
		System.out.println(100 << 2); 
		// 일반 10진수 숫자를 shift해도 10진수를 2진수로 바꾼 다음 계산해서 출력, 값이 2^n승 즉 2*2한 값을 곱해서 출력
		System.out.println(100 >> 2); // 나누기 2*2
	} // 왼쪽으로 shift하면 값이 커지고 오른쪽으로 하면 작아짐, 컴퓨터는 주로 shift로 곱하기를 계산한다
	
	public static String toBinary(int value) { 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	} // String.format = printf처럼 사용하면서 문자열로 return한다, "%8s" = 8글자라는 의미, replace("","0") = 공백이 있으면 0으로 넣어라
}
// int는 4byte로 총 32bit, 
// 지굼 int는 1byte만 쓰고 있어서 not연산을 사용할 때 앞에 28bit가 0이어서 1으로 환산되어 출력됨
// not연산하면서 byte가 아니라 bit로 출력됨