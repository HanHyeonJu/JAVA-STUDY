package application;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 은행 클래스
public class Bank {
	private String bankname; //현재 은행의 이름
	private Account account[] = new Account[50]; // 계좌의 정보를 담을 배열생성
	private Member member[] = new Member[10]; // 회원의 정보를 담을 배열 생성
	private int accountcount = 0; // 계좌의 정보를 저장할 공간 
	private int membercount = 0; // 회원의 정보를 저장할 공간
	private int out = -1; // 로그인과 로그아웃을 확인하기 위한 변수, -1을 기본값으로 설정
	private Scanner scanner = new Scanner(System.in);

	public Bank() {

	}

	public Bank(String bankname) {
		this.bankname = bankname;
	}

	// 회원가입을 위한 메소드(간단히 아이디, 비밀번호 생성만을 위함)
	public void members() { 
		System.out.println("고객님의 성함을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("고객님이 원하시는 아이디를 입력해주세요");
		System.out.println("ID 형식 : 영문자와 숫자 조합으로 아이디를 생성해주세요(6~20자리 허용)");
		String id = scanner.nextLine();
		
		// 아이디를 영문자와 숫자 조합으로 만들기 위해 정규표현식 Pattern과 Matcher 사용
		Pattern idPattern = Pattern.compile("^[a-zA-Z]\\w{5,19}$"); 
		Matcher idMatcher = idPattern.matcher(id);
		
		if (!idMatcher.matches()) {
			System.out.println("잘못된 입력입니다.");
		} else if (ID(id)) {
			System.out.println("이미 존재하는 아이디입니다");
		} else if (id.length() < 6) {
			System.out.println("잘못된 입력입니다");
		} else {
			System.out.println("정상적으로 아이디가 생성되었습니다");
		}

		System.out.println("고객님이 원하시는 비밀번호를 입력해주세요");
		System.out.println("PASSWORD 형식 : 영문자, 숫자, 특수문자 조합으로 비밀번호를 생성해주세요(10~20자리 허용)");
		String password = scanner.nextLine();
		
		// 아이디와 마찬가지로 비밀번호를 영문자와 숫자 그리고 특수문자 조합으로 만들기 위해 정규표현식 Pattern과 Matcher 사용
		Pattern pwPattern = Pattern.compile("(?=.*[a-zA-ZS])(?=.*?[#?!@$%^&*-]).{9,19}");
		Matcher pwMatcher = pwPattern.matcher(password);

		if (!pwMatcher.matches()) {
			System.out.println("잘못된 입력입니다.");
		} else if (password.length() < 10) {
			System.out.println("잘못된 입력입니다");
		}
		member[membercount++] = new Member(name, id, password); // 회원정보를 저장하는 배열에 조건에 맞게 생성된 이름, 아이디, 비밀번호를 저장
		System.out.println("환형합니다 " + name + " 고객님");
	}

	public boolean ID(String id) { // 아이디를 생성할 때 기존에 있는 아이디인지 아닌지 구분하는 메소드 필요
		boolean same = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].getId().equals(id)) {
				same = true;
			}
		}
		return same;
	}
	
	// 계좌 생성을 위한 메소드
	public void accounts() { 
		System.out.println("고객님이 원하시는 계좌번호를 입력해주세요");
		System.out.println("계좌번호 형식 : 111 - @@@@");
		System.out.print("111 - ");
		String anum = "111 -" + scanner.nextLine(); // 사용자가 편할 수 있도록 기본형식을 지정해줌
		if (ANUM(anum)) {
			System.out.println("이미 존재하는 계좌번호입니다");
		}
		System.out.println("고객님이 원하시는 비밀번호를 입력해주세요(4자리 숫자)");
		String apassword = scanner.nextLine();
		
		if (apassword.length() > 4) {
			System.out.println("잘못된 입력입니다");
		} else if (apassword.length() < 4) {
			System.out.println("잘못된 입력입니다");
		} else {
			
			account[accountcount++] = new Account(anum, apassword); // 계좌의 정보를 저장하는 배열에 조건에 맞게 생성된 계좌번호와 계좌비밀번호를 저장
			System.out.println("고객님의 계좌가 정상적으로 개설되었습니다");
		}
	}

	public boolean ANUM(String anum) { // 계좌번호도 아이디와 마찬가지로 기존에 존재하는 계좌 중 같은 계좌번호가 있는지 확인하는 메소드 필요
		boolean same2 = false;
		for (int i = 0; i < accountcount; i++) {
			if (account[i].getAnum().equals(anum)) {
				same2 = true;
			}
		}
		return same2;
	}

	// 로그아웃 메소드
	public void logout() {
		out = -1;
		System.out.println("로그아웃 되었습니다");
	}

	// 로그인 메소드
	public boolean login(String id, String password) {
		boolean accvalue = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].success(id, password)) {
				accvalue = true;
				out = i;
				break; // for문에 대한 break문
			}
		}
		return accvalue;
	} // 변수 out의 값이 -1일 경우 로그아웃 아닐 경우는 로그인 된다

	public Account Access(String anum, String apassword) {
		
		for (int i = 0; i < accountcount; i++) {
			if (account[i].correct(anum, apassword)) {
				return account[i];
			}
		}
		return null;
	}
	
	// 은행의 정보를 사용자에게 보여주기 위한 메소드
	public void Bdisplay() {
		System.out.println(bankname);
		System.out.println("현재 가입된 고객의 수 : " + membercount);
	}
	
	// 로그인한 회원에 관한 정보를 보여주는 메소드
	public void Mdisplay() {
		System.out.println("회원정보");

		for (int i = 0; i < membercount; i++) {
			member[i].memberdisplay();
		}

		System.out.println("보유하고 있는 계좌의 갯수 : " + accountcount);

		for (int i = 0; i < accountcount; i++) {
			account[i].accountdisplay();
		}	
	}
	
	// 입출금 정보를 사용자에게 보여주기 위한 메소드
	public void Adisplay() {
		System.out.println("입출금 정보");

		for (int i = 0; i < accountcount; i++) {
			account[i].accountdisplay();
		}
	}

	// 메뉴 메소드
	public void menu() {
		boolean running = true; // while문을 나갈 수 있도록 하기 위해 설정한 boolean타입 변수
		String choice = null; // 메뉴선택을 할 수 있도록 하기 위해 설정한 변수

		while (running) { // while문을 사용하여 계속해서 메뉴를 사용할 수 있도록 함
			System.out.println("반갑습니다 고객님 원하시는 메뉴를 선택해주세요");
			System.out.println("1. 회원가입 2.은행정보 3.로그인(회원정보조회) 4.로그아웃 5.계좌개설 6.입금 7.출금 8.회원탈퇴 9.종료");
			choice = scanner.nextLine();
			switch (choice) { // 메뉴를 선택하였을 경우에 메뉴마다 다른 메소드들이 실행될 수 있도록 switch case문 사용
			case "1":
				members();
				break;
			case "2":
				Bdisplay();
				break;
			case "3":
				System.out.println("ID > ");
				String id = scanner.nextLine();
				System.out.println("PASSWORD > ");
				String password = scanner.nextLine();
				
				if (login(id, password)) {
					System.out.println("로그인 되었습니다");
				} else {
					System.out.println("잘못된 아이디나 비밀번호를 입력하셨습니다");
				}
				Mdisplay();
				break;
			case "4":
				logout();
				break;
			case "5":
				accounts();
				break;
			case "6":
				System.out.println("입금 할 계좌번호 > ");
				System.out.print("111 - ");
				String anum = "111 -" + scanner.nextLine();
				System.out.println("계좌 비밀번호 > ");
				String apassword = scanner.nextLine();
				Account account = Access(anum,apassword);
				
				if(account != null) { // 계좌번호와 계좌비밀번호가 맞다면 입금할 수 있도록 함
					System.out.println("입금할 금액을 입력하세요 > ");
					int Pmoney = scanner.nextInt();  
					account.plus(Pmoney);
				}else {
					System.out.println("잘못된 입력입니다");
				}
				
				Adisplay();
				break;
			case "7":
				System.out.println("출금 할 계좌번호 > ");
				System.out.print("111 - ");
				anum = "111 -" + scanner.nextLine();
				System.out.println("계좌 비밀번호 > ");
				apassword = scanner.nextLine();
				account = Access(anum,apassword);
				
				if(account != null) {
					System.out.println("출금할 금액을 입력하세요 > ");
					int Mmoney = scanner.nextInt();
					int Rmoney = 0;
					Rmoney = account.getMoney();
					
					if(Mmoney > Rmoney) { // 잔액이 부족할 경우 출금이 되지 않고 "잔액이 부족합니다"라는 문구가 뜰 수 있도록 함
						System.out.println("잔액이 부족합니다");
					}else {
						account.minus(Rmoney);
					}
				}
				
				Adisplay();
				break;
			case "8":
				if(out != -1) {
					System.out.println("비밀번호를 입력하세요");
					password = scanner.nextLine();
					delete(password);
				}else {
					System.out.println("로그인 하세요");
				}
				break;
			case "9":
				System.out.println("이용해주셔서 감사합니다");
				running = false;  
				break;
			}

		}

	}
	
	// 계정삭제 메소드
	private void delete(String password) { // 로그인을 한 상태일 때 비밀번호만 확인하고 삭제할 수 있게 함
		delete(member[out].getId(),password);		
	}
	
	private void delete(String id, String password) { // 로그인을 하지 않은 경우 아이디와 비밀번호를 전부 확인하고 삭제할 수 있게 함
		boolean del = false;
		for(int i = 0; i < membercount; i++) {
		if(member[i].success(id, password)) {
			out = i;
			del = true;
			break;
		   }
	   }
		if(del = true) { // 아이디와 비밀번호가 맞으면 삭제
			for(int i = out; i + 1 < membercount; i++) {
				member[i] = member[i+1]; 
			}
				membercount--; 
				out = -1; // 계정을 삭제하면 마찬가지로 로그아웃이 돼야 하기 때문에 out = -1을 이용
				System.out.println("삭제되었습니다");
			}
			else {
				System.out.println("삭제하지 못 했습니다");
			}
		}	
}
