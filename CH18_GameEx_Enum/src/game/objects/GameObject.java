package game.objects;

public enum GameObject {
	// name, id를 enum의 상수 값으로 한 번에 대체
	가위, 바위, 보; // 인덱스 번호 0, 1, 2
	
	private int[][] comparison = {
			/*가위(0)*/		{0,-1,1}, //비김, 짐, 이김
		    /*바위(1)*/	    {1,0,-1},
		    /*보(2)*/		{-1,1,0},
			}; // 승리 패배 비김 이중배열
	// 상대의 가위, 바위, 보와 비교해서 결과 리턴
	public int compare(GameObject ob) { // GameObject ob는 내 enum이 아닌 다른 enum
		return comparison[this.ordinal()][ob.ordinal()]; // enum의 인덱스 번호끼리 비교
	}
	
}// 가위, 바위, 보 객체를 쓰지 않고 enum 상수로 해결
