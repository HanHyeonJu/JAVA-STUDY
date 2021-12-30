package application;
//계좌 클래스
public class Account {
	
	private String anum; //계좌번호
	private String apassword; //계좌비밀번호
	private int money; //잔액

	public Account() {
		
	}
	
	public Account(String anum, String apassword, int money) {

		this.anum = anum;
		anum = null;
		this.apassword = apassword;
		apassword = null;
		this.money = money;
	}
	
	public boolean correct(String anum, String apassword) { // 계좌번호와 계좌 비밀번호 모두가 맞을 경우 true 아닐 경우 false를 return할 메소드
		boolean cvalue = false;
		if(anum.equals(anum) && apassword.equals(apassword)) {
			cvalue = true;
		}
		return cvalue;
	}
	
	public void accountdisplay() { // 입출금 후에 정보를 고객에게 보여주기 위한 메소드
		System.out.println("계좌번호 : " + anum);
		System.out.println("잔액 : " + money);
	}
			
	public void plus(int Pmoney){ // 입금 메소드
		money += Pmoney;
	}
	
	public void minus(int Mmoney){ // 출금 메소드
		money -= Mmoney;
	}
	
	
	public String getAnum() {
		return anum;
	}

	public void setAnum(String anum) {
		this.anum = anum;
	}
	
	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}



}
