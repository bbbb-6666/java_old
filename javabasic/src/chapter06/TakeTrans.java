package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
				
		Student studentJames = new Student("James", 5000); 
		 // 제임스5000원은 패러미터. 패러미터 안주면 오류생김. 
		 // 왜 오류가 생기냐면 우리가 student이름을 가진 생성자를 만들었기때문에. 
		 // 그래서 패러미터가 있기때문에 패러미터 값을 입력해줘야함.
		Student studentTomas = new Student("Tomas", 10000);
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway("2");
		////////이 라인까지는 객체를 생성한 것.
		
		
		studentJames.takeOnBus(bus100);
		studentJames.showInfo();
		bus100.showinfo();
		
		studentTomas.takeOnBus(bus100);
		studentTomas.showInfo();
		bus100.showinfo();
		
		studentJames.takeOffBus(bus100);
		studentJames.showInfo();
		bus100.showinfo();
		
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showinfo();
		
		
		
	}

}
