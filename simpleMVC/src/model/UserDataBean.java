package model;

public class UserDataBean {
	private String firstname;
	private String lastname;
	private String email;
	
	
	//저 세개의 값을 가지고 있는 생성자 추가
	public UserDataBean(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	//게터세터 생성
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

	//"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	//객체를 user라는 객체를 하나 만듦. 그거를 기본 생성자로 해서 유저 데이터비인이라는 것을 만듦.
	/* toString 예제
	 * UserDataBean user = new UserDataBean("um", "namkyoung", "nkum@gmail.com");
	 * user.toString > 이렇게 하면 출력할때 용이함
	 */
	
	@Override
	public String toString() {
		return "UserDataBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
}
