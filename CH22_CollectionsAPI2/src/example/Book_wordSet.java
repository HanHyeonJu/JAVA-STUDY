package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이 때 리스트는 단어가 중복 되지 않는다. 알파베 순으로 저장 => TreeSet

		// 책 파일 불러오기
		File gatsby = new File("gatsby.txt"); // 위치 : C:\JAVA\JAVA-STUDY\CH23_CollectionsAPI\gatsby.txt
		System.out.println(gatsby.exists()); // 파일이 존재하는지 확인

		TreeSet<String> glist = loadWords(gatsby); // TreeSet glist의 객체가 따로 없으므로 wordSet의 객체인 new TreeSet<>()이 glist의
													// 객체가 됨

		System.out.println(glist.size()); // 중복단어를 제외하고 단어의 갯수

		for (String w : glist) {
			System.out.println(w);
		}
	}

	/**
	 * 입력된 파일을 읽어서 단어를 저장해서 마지막에 TreeSetList로 리턴
	 * 
	 * @param gatsby
	 * @return
	 */
	private static TreeSet<String> loadWords(File gatsby) {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(gatsby))) {// try(reader코드)로 작성되면 close를 작성해주지
																					// 않아도 자동으로 close 해준다. 세미콜론 생략해도 괜찮음
			// 파일 읽기
			String line = null;
			// 한 줄 읽기
			while ((line = reader.readLine()) != null) {// 파일의 끝에 더이상 문자가 없으면 null
				String[] words = line.split("[^a-zA-Z]+");
				// TreeSet 단어로 분리해서 입력(자동 정렬 및 중복제거), 문자열이 클래스객체가 아니기 때문에 compareTo가 되어있어서 자동정렬
				// 가능
				for (String w : words) {
					if (w.length() < 6) { // 단어가 너무 많으므로 5자 이하면 그냥 넘기기
						continue;
					}
					wordSet.add(w.toLowerCase()); // 소문자로 단어 입력
				}
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우 예외
			System.out.println("파일을 찾지 못했음");
		} catch (IOException e) {
			// 파일을 읽지 못하는 경우 예외
			System.out.println("파일을 읽지 못함");
		}
		return wordSet;

	}

}
