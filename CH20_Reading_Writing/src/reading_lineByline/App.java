package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String fileLocation = "C:\\JAVA\\JAVA-STUDY\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println(); // 한 줄 띄우기 용
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){// try(reader코드)로 작성되면 close를 작성해주지 않아도 자동으로 close 해준다. 세미콜론 생략해도 괜찮음
			// 파일을 읽기위한 객체 생성
			//BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			// 파일 읽기
			String line = null;
			//한 줄 읽기
			while((line = reader.readLine()) != null) {// 파일의 끝에 더이상 문자가 없으면 null
					System.out.println(line); // 더이상 읽을 줄이 없을때까지 한줄씩 출력
			}
			//reader.close(); // reader가 지역변수 이기 때문에 안에서 닫아줘야 함
			 
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우 예외
			// e.printStackTrace() : 빨간색 예외처리(?)
			System.out.println("파일을 찾지 못했음 : "+fileLocation); // 이 주소에서 파일을 찾지 못함
		}catch (IOException e) {
			// 파일을 읽지 못하는 경우 예외
			//e.printStackTrace();
			System.out.println("파일을 읽지 못함 : "+fileLocation);
		}
	}
}
