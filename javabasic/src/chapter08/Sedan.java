package chapter08;

public class Sedan extends Car { //car 클래스 상속
	//생성자 호출 관계 확인 
	
	//디폴트 생성자 default constructor
		public Sedan() {
			System.out.println("Sedan 클래스 생성자 호출");
		}//end Sedan
		
		//생성자 오버로딩 - (다형성 생성사가 하나는 패러미터가 없고 하나는 name이라고 하는 패러미터를 취함.)
		public Sedan(String name) {
			super("wow");//super : 하위클래스가 상위 클래스의 생성자를 호출하고자 할때 사용하는 명령어
			System.out.println("Sedan 클래스 생성자 호출 with "+name);
		}//end sedan string
		
		
		
		

}//end class
