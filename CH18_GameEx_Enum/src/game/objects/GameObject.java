package game.objects;

public enum GameObject {
	// name, id�� enum�� ��� ������ �� ���� ��ü
	����, ����, ��; // �ε��� ��ȣ 0, 1, 2
	
	private int[][] comparison = {
			/*����(0)*/		{0,-1,1}, //���, ��, �̱�
		    /*����(1)*/	    {1,0,-1},
		    /*��(2)*/		{-1,1,0},
			}; // �¸� �й� ��� ���߹迭
	// ����� ����, ����, ���� ���ؼ� ��� ����
	public int compare(GameObject ob) { // GameObject ob�� �� enum�� �ƴ� �ٸ� enum
		return comparison[this.ordinal()][ob.ordinal()]; // enum�� �ε��� ��ȣ���� ��
	}
	
}// ����, ����, �� ��ü�� ���� �ʰ� enum ����� �ذ�
