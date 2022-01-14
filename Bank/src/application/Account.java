package application;
//계좌 클래스
public class Account {
	
	private String anum; //계좌번호
	private String apassword; //계좌비밀번호
	private int money; //잔액

	public Account() {
		
	}
	
	public Account(String anum, String apassword) {

		this.anum = anum;
		anum = null;
		this.apassword = apassword;
		apassword = null;
		
	}
	
	public boolean correct(String anum, String apassword) { // 계좌번호와 계좌 비밀번호 모두가 맞을 경우 true 아닐 경우 false를 return할 메소드 필요
		boolean cvalue = false;
		if(this.anum.equals(anum) && this.apassword.equals(apassword)) {
			cvalue = true;
		}
		return cvalue;
	}
	
	// 입출금 후에 정보를 고객에게 보여주기 위한 메소드
	public void accountdisplay() { 
		System.out.println("계좌번호 : " + anum);
		System.out.println("잔액 : " + money);
	}
	
	// 입금 메소드	
	public void plus(int Pmoney){ 
		money += Pmoney;
	}
	
	// 출금 메소드
	public void minus(int Mmoney){
		money -= Mmoney;
	}
	
	// private 변수 접근을 위해 get, set메소드 생성
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
