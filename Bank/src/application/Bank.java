package application;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {
	private String bankname;
	private Account account[] = new Account[50];
	private Member member[] = new Member[10];
	private int accountcount = 0;
	private int membercount = 0;
	private int out = -1;
	private Scanner scanner = new Scanner(System.in);

	public Bank() {

	}

	public Bank(String bankname) {
		this.bankname = bankname;
	}

	public void members() {
		System.out.println("고객님의 성함을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("고객님이 원하시는 아이디를 입력해주세요");
		System.out.println("ID 형식 : 영문자와 숫자 조합으로 아이디를 생성해주세요(6~20자리 허용)");
		String id = scanner.nextLine();

		Pattern idPattern = Pattern.compile("^[a-zA-Z]\\w{5,19}$");
		Matcher idMatcher = idPattern.matcher(id);

		if (!idMatcher.matches()) {
			System.out.println("잘못된 입력입니다.");
			// System.exit(0);
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

		Pattern pwPattern = Pattern.compile("(?=.*[a-zA-ZS])(?=.*?[#?!@$%^&*-]).{9,19}");
		Matcher pwMatcher = pwPattern.matcher(password);

		if (!pwMatcher.matches()) {
			System.out.println("잘못된 입력입니다.");
		} else if (password.length() < 10) {
			System.out.println("잘못된 입력입니다");
		}
		member[membercount++] = new Member(name, id, password);
		System.out.println("환형합니다 " + name + " 고객님");
	}

	public boolean ID(String id) {
		boolean same = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].getId().equals(id)) {
				same = true;
			}
		}
		return same;
	}

	public void accounts() {
		System.out.println("고객님이 원하시는 계좌번호를 입력해주세요");
		System.out.println("계좌번호 형식 : 111 - @@@@");
		System.out.print("111 - ");
		String anum = "111 -" + scanner.nextLine();
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
			int money = 0;
			account[accountcount++] = new Account(anum, apassword, money);
			System.out.println("고객님의 계좌가 정상적으로 개설되었습니다");
		}
	}

	public boolean ANUM(String anum) {
		boolean same2 = false;
		for (int i = 0; i < accountcount; i++) {
			if (account[i].getAnum().equals(anum)) {
				same2 = true;
			}
		}
		return same2;
	}

	public void logout() {
		out = -1;
		System.out.println("로그아웃 되었습니다");
	}

	public boolean Access(String id, String password) {
		boolean accvalue = false;
		for (int i = 0; i < membercount; i++) {
			if (member[i].login(id, password)) {
				accvalue = true;
				out = i;
				break; // for문에 대한 break문
			}
		}
		return accvalue;
	}

	public boolean AAccess(String anum, String apassword) {
		boolean aaccvalue = false;
		for (int i = 0; i < accountcount; i++) {
			if (account[i].correct(anum, apassword)) {
				aaccvalue = true;
				break;
			}
		}
		return aaccvalue;
	}
	
	
	public void Bdisplay() {
		System.out.println(bankname);
		System.out.println("현재 가입된 고객의 수 : " + membercount);
	}

	public void Adisplay() {
		System.out.println("회원정보");

		for (int i = 0; i < membercount; i++) {
			member[i].display();
		}

		System.out.println("보유하고 있는 계좌의 갯수 : " + accountcount);

		for (int i = 0; i < accountcount; i++) {
			account[i].Adisplay();
		}	
	}

	public void menu() {
		boolean running = true;
		String choice = null;

		while (running) {
			System.out.println("반갑습니다 고객님 원하시는 메뉴를 선택해주세요");
			System.out.println("1. 계정등록 2.은행정보 3.로그인(회원정보조회) 4.로그아웃 5.계좌개설 6.입금 7.출금 8.회원탈퇴 9.종료");
			choice = scanner.nextLine();
			switch (choice) {
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
				if (Access(id, password)) {
					System.out.println("로그인 되었습니다");
				} else {
					System.out.println("잘못된 아이디나 비밀번호를 입력하셨습니다");
				}
				Adisplay();
				break;
			case "4":
				logout();
				break;
			case "5":
				accounts();
			case "6":
				System.out.println("입금 할 계좌번호 > ");
				String anum = scanner.nextLine();
				System.out.println("계좌 비밀번호 > ");
				String apassword = scanner.nextLine();
				if(AAccess(anum,apassword)) {
					System.out.println("입금할 금액을 입력하세요 > ");
					int pmoney = Integer.parseInt(scanner.nextLine());
				}
			case "7":
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
	
	private void delete(String password) {
		delete(member[out].getId(),password);		
	}
	
	private void delete(String id, String password) {
		boolean del = false;
		for(int i = 0; i < membercount; i++) {
		if(member[i].login(id, password)) {
			out = i;
			del = true;
			break;
		   }
	   }
		if(del = true) {
			for(int i = out; i + 1 < membercount; i++) {
				member[i] = member[i+1];
			}
				membercount--;
				out = -1;
				System.out.println("삭제되었습니다");
			}
			else {
				System.out.println("삭제하지 못 했습니다");
			}
		}	
}
