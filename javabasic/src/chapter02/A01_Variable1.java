package chapter02;

public class A01_Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 10; // 정수형 변수 level 선언
		// level = 10; // level 변수에 값 10을 대입
		System.out.println(level); // level값 출력

		// 변수 명명 규칙 
		// 영문자(대,소문자 포함)와 숫자로 구성된다.
		// 반드시 문자로 시작해된다. 숫자로 시작하면 안됨.
		// 특수문자는 _ 와 $ 만 사용한다
		// 예약어는 사용할 수 없다. 
		
		// 문자 변수 선언과 값의 대입
		char chval = 'a'; // 문자 변수는 작은 따옴표로 감싼다.
		System.out.println(chval);
	} // end of main ()

}//end of class
