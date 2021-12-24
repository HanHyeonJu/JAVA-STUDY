package application;

public class Account {
	
	private String anum;
	private String apassword;
	private int money;
	private int Pmoney;
	private int Mmoney;

	public Account() {
		
	}
	
	public Account(String anum, String apassword, int money) {

		this.anum = anum;
		anum = null;
		this.apassword = apassword;
		apassword = null;
		this.money = money;
	}
	
	public boolean correct(String anum, String apassword) {
		boolean cvalue = false;
		if(anum.equals(anum) && apassword.equals(apassword)) {
			cvalue = true;
		}
		return cvalue;
	}
	
	public void Adisplay() {
		System.out.println("계좌번호 : " + anum);
		System.out.println("잔액 : " + money);
	}
			
	public void plus(int Pmoney){
		this.Pmoney = Pmoney;
		money += Pmoney;
	}
	
	public void minus(int Mmoney){
		this.Mmoney = Mmoney;
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

	public int getPmoney() {
		return Pmoney;
	}

	public void setPmoney(int pmoney) {
		Pmoney = pmoney;
	}

	public int getMmoney() {
		return Mmoney;
	}

	public void setMmoney(int mmoney) {
		Mmoney = mmoney;
	}

}
