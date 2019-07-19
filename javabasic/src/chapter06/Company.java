//싱글톤패턴
package chapter06;

public class Company {
	//생성자를 private 으로 만든다.(=private 생성자를 만든다.)
	private static Company instance = new Company();
	private Company() {
	
	}//end private company
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company ();
		}//end if
		return instance;
	}//end public 

}//end class
