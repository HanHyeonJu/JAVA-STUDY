package application;

public class Increment {

	public static void main(String[] args) {
		// ���� ���� 1�� ���� 1�� ���� => �ݺ��� [�������ҿ�����]
		
		int count = 0;
		
		// 1�� ����		
		count = count + 1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++;
		System.out.println(count);
		++count;
		System.out.println(count);
		
		// ���Ͱ��� 4���� ������� 1�� ���� ���Ѷ�.
		
		count = count - 1;
		System.out.println(count);
		count -= 1;
		System.out.println(count);
		count--;
		System.out.println(count);
		--count;
		System.out.println(count);
		

	}

}
