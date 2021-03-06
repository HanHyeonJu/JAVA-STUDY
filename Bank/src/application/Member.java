package application;

import java.util.Objects;

//회원 클래스
public class Member {

	private String name; // 회원의 이름
	private String id; // 회원 아이디
	private String password; // 회원 비밀번호
	
	public Member() {
		
	}
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public boolean success(String id, String password) { // 아이디와 비밀번호 모두가 맞을 경우 true 아닐 경우 false를 return할 메소드 필요
		boolean value = false;
		if(this.id.equals(id) && this.password.equals(password)) {
			value = true;
		}
		return value;
	}
	
	// 로그인 후에 고객의 정보를 볼 수 있도록 보여주는 메소드
	public void memberdisplay() {
		System.out.println("ID : " + id);
		System.out.println("성함 : " + name);
	}
	
	// private 변수 접근을 위해 get, set메소드 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
