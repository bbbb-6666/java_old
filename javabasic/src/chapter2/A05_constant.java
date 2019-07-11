/*
 * 상수 : 프로그램에서 변하지 않는 수, 항상 변하지 않는 값
 * 자바에서는 상수를 선언하는 데 있어서 final이라는 키워드를 사용해서 선언한다.  
 */

/*
package chapter2;

public class A05_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 1000;
		final double PI = 3.141592 ;
		System.out.println(MAX_NUM);
		System.out.println(PI);
		
		//MAX_NUM=2000; // 이거치면 오류 뜨는 내용 : 파이널로 해서 선언되는 숫자값은 상수이기 대문에 값을 변경하면 안된다.
		                // 굳이 하고 싶으면 final 이라는 키워드를 걷어내면 됨.
		
		System.out.println(1+MAX_NUM); //보통 대문자로 선언을 함.
		*/
		// 상수 이해 안됨. 
		// 반복적으로 사용하고 변환하지 않는 값들을 상수로 선언하는 것이 좋다.
		
		
		
/*
 * 리터럴 : 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 일컫는 말 
 * 보통은 대입 연산자의 오른쪽에 쓰여지는 값을 이야기 함.
 * 'A' 10, 3.141592 ..... >> 이런식으로 표현이 됨.
 * 
 * 
 */
		
		


// 키보드로부터 입력 받기
package chapter2;

import java.util.Scanner;

public class A05_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*final int MAX_NUM = 1000;
		final double PI = 3.141592 ;
//		System.out.println(MAX_NUM);
//		System.out.println(PI);
//		
//		System.out.println(1+MAX_NUM); */
		
		Scanner sc = new Scanner (System.in);
		//스캐너 오류 : scanner라고 클래스는 자바 유틸안에 있는 건데, 기본적으로 임포트가 되지 않아서 오류가 뜸.
		//scanner 에 마우스 대서 import 웅앵 누름 그러면 위에 import java.util.Scanner; 뜸
		// new Scanner : 새로운 스캐너를 만들겠다
		// System.in : 키보드를 통한 입력
		// 키보드를 통한 입력을 받기 위해서 스캐너 객체 sc를 생성한다는 뜻
		System.out.println("반지름을 입력해주세요 : ");
		double r = sc.nextDouble();
        //스캐너에서 데이터값을 받아들이는데 더블형으로 받아들이겠다.		
		double circleArea = r * r * PI;
		System.out.println((int)circleArea); 
		//원의 면적을 만드는 프로그램이 만들어진것.
		/*System.out.println(MAX_NUM);
		  System.out.println(PI);
		  System.out.println(1+MAX_NUM);  >>이거 컨트롤 / 눌러서주석처리 */
		
		//컨트롤 f11 눌러서 콘솔 내고 3 입력해보면 28.웅앵ㅇ우 나옴
		// 원래 System.out.println((int)circleArea); 여기에 int 없엇음.
		// 지금 추가한 거. 그러면 이거 입력하고 콘솔 내고 3 누르면 28만 나옴
		// 이걸 명시적 형변환(explicit type conversion)
		
		
		/*
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 지금까지 한 거 정리 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 - 변수 선언 하기 : 데이터타입data type, 변수명variable name ; 
		              (데이터타입과 변수명규칙을 알아야함)
		 - 타입 : 숫자 byte. int. short. long
		                문자형 char
		       float, double
		          boolean
		 - 변수명 명명 규칙
		*/
		
		// 문자열을 취급하기 위한 데이터 타입
		   String name = "Hong Gildong";
	 	   System.out.println(name);
	 	   System.out.println("이름을 입력해주세요 : ");
	 	   name=sc.next(); //->이렇게 하면 name 에 스트링값을 입력해줄 수 있음
	 	   System.out.println(name);
	 	   

	 	   
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
