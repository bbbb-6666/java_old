package chapter05;

public class Car {
 // 클래스의 첫글자는 대문자를 써주기.
	
	//멤버변수 (=필드, 속성, 멤버속성)
	// String color;
	//private int speed; //원래는 int speed; 
	
	public void setSpeed(int value) {
		speed = value;
	}//end public
	
	//멤버 메소드(=메소드,함수(자바에서는 함수라는 표현보다 메소드라는 표현을 쓰는게 일반적))
	//메소드를 선언할 때는 메소드 앞에 데이터타입을 적어줘야한다. (void)
	//보이드는 이 메소드가 값을 돌려줄 게 없다는 뜻.
	//int value = 패러미터
	//public은 외부에서 자유롭게 접근 가능 .
	//300이하 업X, 속도는 0보다 작아질 수 없다고 설정. (if)
	
	//이 메소드는 가속 메소드.
	public void upSpeed(int value){
		if(speed+value > 300) speed = 300;
		else speed = speed + value;
	}//end upSpeed()
	
	//감속 메소드
	public void downSpeed(int value) {
		if(speed+value <= 300) speed = 0;
		else speed = speed - value;
		
		
	}//end downSpeed()
	
	
	//show speed
	public void showInfo() {
		System.out.println("차 색깔은 "+color+", 현재 속도는 "+speed);
	}//end 쇼인포()
	
	
	///////////////////
	//생성자 설명
	private String color="흰색";
	private String engine = "가솔린";
	private String inner = "가죽";
	private int speed=0;
	
	//public Car() { //기본생성자 //여기에 void를 넣으면 cartest에 오류가 뜨는데 그 이유는
		           //생성자는 명시된 리턴 타입이 없어야하기 때문임.
		           //void를 쓰면 리턴되었다는 타입이 있다는 전제가 생기기 때문에 
		           //그래서 빼면 됨. void : 리턴값이 없을때, 아무거나 될 때 두가지를 다 포함. 
		
	//}//end car 기본생성자
	
	/*
	public Car(String pcolor, String pengine, String pinner) { 
		//컬러값을 받는 생성자
	      color = pcolor;
	      engine = pengine;
	      inner = pinner;
	}//end car쏼라*/

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * @return the inner
	 */
	public String getInner() {
		return inner;
	}

	/**
	 * @param inner the inner to set
	 */
	public void setInner(String inner) {
		this.inner = inner;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	//둘 중 하나의 생성자를 가지고 생성을 함.
	/*다형성 - 오버라이딩과 오버로딩으로 나뉨. 동일한 이름가지고 여러개의 메소드를 만들어내는데,
	 * 그 메소드를 만들어내는데 패러미터의 타입을 가지고 어떤 메소드를 호출할것인 결정하는 것을 
	 * 오버로딩 이라고 하고 오버라이딩은 상속이라는 개념에서 상위클래스에서 메소드를 정의해놓은 것을 
	 * 하위 클래스에서 고쳐서 쓸 수 있다. 이 개념을 오버라이딩이라고 한다.
	한 클래스 안에 동일한 이름을 가진 메소드를 패러타입의 개수와 타입에 따라 다른 기능을 
	수행할 수 있음.
	
	 책에서는 생성자가 메소드가 아니라고 했지만, 엄밀하게 얘기하면 
	 생성자를 특별한 형태의 메소드라고 얘기함.
		*/
	
	
	
	///////////////// this ////////////////////////
	public Car(String color, String engine, String inner) { 
	      this.color = color;
	      this.engine = engine;
	      this.inner = inner; 
	      }
	      
	      
	/*
	this.color 에서 this의 표현의 뜻
	 : 해당 클래스로부터 인스턴스화(객체화) 되어진,  해당 클래스 객체의  
	*/
	      
	//생성자에 this를 써보면?
	public Car() { 
		this("검정색", "디젤", "패브릭"); 
		//자기자신을 콜하는데, 패러미터를 가지고  가는 형태
	}//end this 

	Car returnItself() {
		return this; // 뜻 : 이 클래스로부터 생성된 객체의 시작 주소값을 리턴한다.
		             //자기 자신을 리턴시켜주는 메소드를 만든 것임.
	}
	
	      
	
}//end class car
