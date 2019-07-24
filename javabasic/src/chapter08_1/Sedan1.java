package chapter08_1;

public class Sedan1 extends Car1 {
	//field
	//color, speed는 car1에서 상속된것.
	
	public void setSpeed(int speed) {
		//this.speed = speed;
	}//end setspeed
	
	public void setColor(String color) {
		super.setcolor(color);
	}//end setcolor
	
	public void getColor(String color) {
		return super.getcolor();
	}

}
