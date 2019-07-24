package chaptet08_2;

public class Sedan2 extends Car2 {
	int passengerCount;
	
	public void takeOn() {
		passengerCount++;
	}//end takeon

	public void showInfo() {
		super.showInfo(); //car에 보이드가 있어서 밑에 sysout에 같이 못 넣음.
		System.out.println(passengerCount);
	}
}
