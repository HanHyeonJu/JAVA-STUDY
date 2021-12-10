package exampletotal;

import java.util.ArrayList;

class Menu{
	private String name; // 메뉴명
	private int price; // 가격
	private int count; // 하루 판매량
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getCount() {
		return count;
	}
}

class Store{
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<Menu>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	//4. 총 매출액 계산 메소드를 만드시오
	public int totalSales() {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int p = list.get(i).getPrice();
			int c = list.get(i).getCount();
			sum += p * c;	
		}
		return sum;
	}
}

public class TotalSales {

	public static void main(String[] args) {
		// 1. 메뉴의 객체를 생성
		Menu m1 = new Menu("김밥", 2000, 57);
		Menu m2 = new Menu("돈까스", 6000, 29);
		Menu m3 = new Menu("냉면", 5000, 34);
		
		// 2. 스토어 객체를 만든 후 위의 메뉴들을 추가하세요
		Store store = new Store();
		store.add(m1);
		store.add(m2);
		store.add(m3);
		
		// 3.하루 총 매출을 계산하세요
		System.out.printf("총 매출 : %d원", store.totalSales());

	}

}
