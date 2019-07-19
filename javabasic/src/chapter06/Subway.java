package chapter06;

public class Subway {
	String LineNumber;
	int passengerCount;
	int money;

	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}//public Subway
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showinfo() {
		System.out.println(LineNumber+"호선의 승객은 "
	                        +passengerCount+ "명이고, 수입은 "
	                        +money+"원입니다.");
	}
}
