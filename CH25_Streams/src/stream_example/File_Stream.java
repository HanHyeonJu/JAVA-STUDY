package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\JAVA\\JAVA-STUDY\\CH25_Streams\\98-0.txt");
		
		try {
			Files.lines(path).forEach(s -> System.out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
