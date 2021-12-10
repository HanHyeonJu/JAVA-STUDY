package exampletotal;

import java.util.ArrayList;

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}	
}

class Cart{
	private ArrayList<Item> list;
	
	public Cart() {
		this.list = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	
	//3. 장바구니 총합 메소드를 완성하시오
	public int totalPrice() {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			int p = list.get(i).getPrice();
			sum = sum + p;
		}
		return sum;
	}
}
public class TotalPrice {

	public static void main(String[] args) {
		//1. 구매 상품 객체를 생성하시오
//		ArrayList<Item> item = new ArrayList<>();
	    Item p1 = new Item("스프라이트 셔츠",49900);
		Item p2 = new Item("슬림 면바지",58900);
		Item p3 = new Item("스니커즈",46900);
		
		//2. 장바구니에 상품을 담으세요
		Cart myCart = new Cart();
		myCart.add(p1);
		myCart.add(p2);
		myCart.add(p3);
		
		//4. 총합 출력
		System.out.printf("총합: %d원", myCart.totalPrice());

	}

}
