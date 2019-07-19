//car 클래스 만들어본 거 Test, 객체테스트
package chapter05;

public class CarTest {

	//실행을 해야하니까 main이 필요함.
	//string[] args : 스트링타입의 배열이라는 뜻
	public static void main(String[] args) {
		
		//Car miriCar = new Car(); //new car();는 생성자
		
		//miriCar.color="검정색";
		//miriCar.speed=0; //car클래스에서 스피드에 프라이빗을 걸어놔서 오류가 뜸.
		   //위에껀 우리가 임의로 변경 가능
		//miriCar.upSpeed(500);  
/*우리가 미리카의 객체가 가지고 있는 스피드값을 
 * 똑같이 입력을 하지만 setSpeed가 가지고 있는 메소드를 통해서 변경하는것.
외부에서는 속성값을 함부로 바꾸는게 아니라, 
허가되어진 통로 셋스피드를 가지고 개체가 가지고 있는 매체를 통해서만 값을 바꾸는 것.*/
//private은 은닉해야될 필요가 있기 때문에. 
		//miriCar.showInfo();
		
		
		/*
		miriCar.upSpeed(50);
		miriCar.color="무지개색";
		miriCar.showInfo();
		
		miriCar.upSpeed(500);
		miriCar.showInfo(); //500이라고 입력을 해도 300까지 밖에 못감.
		
		miriCar.downSpeed(290);
		miriCar.showInfo(); //값은 10임. 왜냐면 위에 300이었다가 290을 빼서 10으로 다운.
		
		miriCar.downSpeed(30);
		miriCar.showInfo(); //원래는 마이너스지만 값은 0. 왜냐면 조건을 0까지만 나오게 걸어놨기때문에.
		*/
		
		
		/*
		 * 스택메모리에 미리카라고 하는 변수가 만들어짐.
		 * 힙메모리 영역에는 color, speed가 들어감.
		 */

		//System.out.println(miriCar); 
		   //이거출력하면 chapter05.Car@15db9742가 뜨는 데 이것은 16진수값.
		   //color, speed가 메모리 안에 15db9742이라는 주소값이 만들어졌다는 것.
		
		/*
		//생성자 설명
		Car miriCar = new Car();
		/miriCar.showInfo();*/
		
	
		/*
		Car skyCar = new Car("하늘", "디젤", "인조가죽");
	    skyCar.showInfo();
		
	    skyCar.setColor("빨강");
	    skyCar.showInfo();*/
		
	    
		//////////This 반환
		Car miriCar = new Car();
		System.out.println(miriCar); //주소값 찾기
		
		Car c = miriCar.returnItself();
		System.out.println(c); //위에 주소값이랑 똑같음.
		//왜 똑같은가? 미리카로부터 파생되어진 개체의 주소값을 다시 c한테 돌려줬기 때문에. 
	    
	    
	}

}
