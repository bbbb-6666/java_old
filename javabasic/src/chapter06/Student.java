package chapter06;

public class Student {
	public static int serialNum= 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public int money;
	
	//이름과 가진 돈을 매개변수(패러미터)로 받는 생성자
	public Student(String studentName, int money) {
		this.studentID = ++serialNum;
		this.studentName = studentName;
		this.money = money;
		
	}//end public Student

	public void takeOnBus(Bus bus)//bus 클래스의 객체참조변수 bus
	  { bus.takeOn(1000);
	    this.money -= 1000;
	}//end public takeBus
	
	public void takeOffBus(Bus bus)//bus 클래스의 객체참조변수 bus
	  { bus.takeOff(1000);
	}//end public takeBus
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}//end public takeSubway
	
	/*
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"원입니다.");
	}*/
	
	//static변수
	public void showInfo() {
		System.out.println(studentID);
		}
	
	public static void showSerial() {
		System.out.println(serialNum);
	} // show시리얼 매소드에 스태틱 키워드가 붙임. 
	  // 객체와 상관없이 클래스가 활성화될때 이 메소드도 만들어짐.
	
	
}
