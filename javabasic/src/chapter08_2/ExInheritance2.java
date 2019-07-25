

//부모클래스로부터 하위클래스가 일정정도의 필드는 상속을 받아서쓰더라고
//내 나름의 필드를 추가할 수 있고, 메소드도 상속 받아서 쓰더라도 내 나름의 메소드를 만들어서 사용할 수 있다.

package chapter08_2;

public class ExInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan2 mysedan = new Sedan2();
		Truck2 mytruck = new Truck2();
		
		mysedan.color = "파랑";
		mysedan.speed = 0;
		mysedan.takeOn();
		mysedan.showInfo();
		
		System.out.println("===============");
		
		mytruck.color = "빨강";
		mytruck.speed = 0;
		mytruck.takeOn();mytruck.takeOn();mytruck.takeOn(); //짐을 세번 싣음.
		mytruck.showInfo();
		
	}//end main

}



