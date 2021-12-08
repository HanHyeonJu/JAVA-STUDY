package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException{ // 파일에 글을 못 적었을 때 throws IOException 생성?
		// 텍스트 읽고 쓰기
		
		String text = "헬로우! \n 하 와 유?"; // 적을 내용
		
		Path path = Paths.get("C:\\JAVA\\new.txt"); 
		//Path path = Paths.get("text.txt"); // 파일의 경로(C:\JAVA\JAVA-STUDY\CH20_Reading_Writing\text.txt)
		// paths.get은 파일 위치?							   
		
		// text.txt에 위의 내용을 적기 (쓰기)
		// Files 클래스에 스테틱 메서드 write(적을파일의 경로, 적을내용(byte타입))
		Files.write(path, text.getBytes()); // . = static메서드? 컴퓨터는 글자를 고대로 받아들이지 못하기 때문에 바이트 단위로 바꿔서 작성
		// 프로젝트를 refresh하면 써졌는지 확인 가능(F5)

		//읽기
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
	}
}
//원래 폴더에 있던 파일이 아니더라도 없으면 그냥 파일을 생성해버림
// utf-8로 인코딩해야 한글 파일 읽어짐
