package chapter06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	/*
	 * 인티져타입으로 되어잇을때 초기값을 따로 주지 않더라도 초기값이 0임. 
	 * 그래서 따로 세팅을 하지 않은 것.
	 */
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}//public Bus
	
	public void takeOn(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void takeOff(int money) {
		this.passengerCount--;
	}
	
	public void showinfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "
	                        +passengerCount+ "명이고, 수입은 "
	                        +money+"원입니다.");
		
	}
	
}
