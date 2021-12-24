package application;

public class Member {

	private String name;
	private String id;
	private String password;
	
	public Member() {
		
	}
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public boolean login(String id, String password) {
		boolean value = false;
		if(id.equals(id) && password.equals(password)) {
			value = true;
		}
		return value;
	}
	
	public void display() {
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
