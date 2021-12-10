package exampletotal;

import java.util.ArrayList;

class Chicken{
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;	
	}
}
public class TotalChicken {

	public static void main(String[] args) {
		
		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		// 홍팍이가 주만한 치킨 list
		order.add(new Chicken("로스트 치킨", 9900));
		order.add(new Chicken("파닭 치킨", 129900));
		order.add(new Chicken("마늘이 치킨", 13900));
		
		// 홍팍이가 주문한 치킨의 합
		int sum = 0;
		
		for(int i = 0; i < order.size(); i++) {
			int p = order.get(i).getPrice(); // 치긴의 가격을 get price로 가져옴
			sum += p;
		}
		
		System.out.printf("총합: %d원\n", sum);
	}

}
