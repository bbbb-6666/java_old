package chapter06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
		Student studentKim = new Student("kim", 10000);
		studentKim.showInfo(); //1001
		
		Student studentLee = new Student("Lee", 10000);
		studentLee.showInfo(); //1002
		*/
		
		
		//객체를 생성하지 않고도 showinfo라는 메소드를 시리얼넘버를 확인
		//객체를 생성하지 않은 상태에서 클래스 변수값을 확인하고 싶을때.
		//System.out.println(Student.serialNum);
		//1000
		
		//메소드 스태틱을 선정해주고 할때.
		System.out.println(Student.grade);
		Student.showSerial();
		
		
		
		
	}

}
