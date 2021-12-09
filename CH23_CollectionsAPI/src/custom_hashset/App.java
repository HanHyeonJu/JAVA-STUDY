package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature{
	private int id;
	private String name;
	
	public Creature(int id, String name) { // super();는 있어도 되고 없어도 되고~
		// super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}

	// hashcode equals를 이용해 id가 같으면 같은 객체로 인식하게 함
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}


		
}

public class App {

	public static void main(String[] args) {
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0,"고양이"));
		creatures.add(new Creature(1,"개"));
		creatures.add(new Creature(2,"돼지"));
		creatures.add(new Creature(2,"돼지")); // new Creature로 Creature의 객체를 새로 생성해주었기 대문에 서로 주소가 다름 그렇기 때문에 다른 객체로 인식
		creatures.add(new Creature(3,"소"));
		creatures.add(new Creature(4,"말"));
		creatures.add(new Creature(4,"비둘기"));
		
		System.out.println(creatures.contains(new Creature(0,"고양이")));
		
		creatures.forEach(System.out::println);

	}

} 
