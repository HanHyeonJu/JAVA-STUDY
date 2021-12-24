package gameobject;

public class GameObject { // rock, paper, scissors의 상위 클래스
	private int id; 
	private String name;
	
	//이중배열 (가위, 바위, 보 / 이김 짐 패배)
	/*			가위    바위    보
	 * 가위(0)  { 0,     -1,   1} // 0 비김 -1 짐 1 이김 왼편의 가위 기준
	 * 바위(1)  { 1,     0,   -1}
	 * 보(2)   { -1,    1,    0}
	 */
	private int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0}
	}; // 승리, 패배, 짐에대한 이중배열
	
	// 상대의 가위, 바위, 보와 비교해서 결과 리턴(지고 비기고 이김을 구분)
	public int compareTo(GameObject ob) {
		return comparison[id][ob.id];
	}
	
	// private로 인스턴스 변수를 선언했기 때문에 가위 바위 보 클래스에서 id와 이름을 생성할 수 있게 get set 메소드 사용
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	} // 가위 바위 보 각각 return형태로 출력
}
