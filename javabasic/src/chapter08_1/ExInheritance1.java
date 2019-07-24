package chapter08_1;

public class ExInheritance1 {
	public static void main(String[] args) {
		Sedan1 mysedan = new Sedan1();
		
		/*
		mysedan.setColor("검정");
		System.out.println(mysedan.color);
		mysedan.setSpeed(100);
		System.out.println(mysedan.speed);
		*/
		
		mysedan.getColor("검정");
		System.out.println(mysedan.color);
		//mysedan.getSpeed(100);
	}
}
