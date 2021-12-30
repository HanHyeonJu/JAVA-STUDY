package application;
//회원 클래스
public class Member {

	private String name; // 회원의 이름
	private String id; // 회원 id
	private String password; // 회원 password
	
	public Member() {
		
	}
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public boolean login(String id, String password) { // 아이디와 비밀번호 모두가 맞을 경우 true 아닐 경우 false를 return할 메소드
		boolean value = false;
		if(id.equals(id) && password.equals(password)) {
			value = true;
		}
		return value;
	}
	
	public void memberdisplay() { // 로그인 후에 고객의 정보를 볼 수 있도록 보여주는 메소드
		System.out.println("ID : " + id);
		System.out.println("성함 : "+ name);
		
	            }
	
	
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
