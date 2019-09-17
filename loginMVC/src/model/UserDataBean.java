package model;

public class UserDataBean {

	//외부에서 수정 안되는 private형의 필드선언 
	private String firstname;
	private String lastname;
	private String email;
	
	
	//매개변수를 받는 생성자
	public UserDataBean(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	public UserDataBean() {
		
	}

	//getter & setter
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//출력에 사용할 toString 메소드
	@Override
	public String toString() {
		return "UserDataBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
}
