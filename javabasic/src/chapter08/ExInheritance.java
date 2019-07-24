package chapter08;

public class ExInheritance {

	public static void main(String[] args) { //프로그램이 실행이 되어야하니까 main 체크
		
		//먼저 상속 관계에 있는 클래스들의 생성자 호출 관계를 확인하자 
		Sedan sedan1 = new Sedan(); //Sedan클래스로부터 sedan1이라고 하는 객체를 생성
        System.out.println("===================");
		Sedan sedan2 = new Sedan("miri");
		//car클래스는 따로 명시가 있지 않는 한 기본 생성자를 호출한다.
		
	}//end main

}//end class ExInheritance
