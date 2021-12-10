package hashMap;

import java.util.HashMap;

public class Iterating_Map {

	public static void main(String[] args) {
		HashMap<String, String> months = new HashMap<>();
		
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		// 람다식으로 출력
		months.forEach((monthCode, monthName)-> System.out.println(monthCode+" : "+monthName));
		System.out.println();
		
		// entrySet() : key와 value값을 가져옴
		for(var entry : months.entrySet()) {
			var monthCode = entry.getKey();
			var monthName = entry.getValue();
			System.out.println(monthCode +" : " + monthName);
		}
		
		
		
		
		
		
		// keySet() : key값을 가져옴
		for(String monthCode : months.keySet()) {
			String monthName = months.get(monthCode);
			
			System.out.println(monthCode +" : " + monthName);
		}

	}

}
