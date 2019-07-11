/*
 * 실수형 데이터 타입
 * - float  : 4byte (부호비트=1, 지수부=8, 가수부=23비트 :: 총 32비트) 
 * - double : 8byte (부호비트=1, 지수부=11, 가수부=52비트 :: 총 64비트)
 */

package chapter2;

public class A03_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바에서는 기본 실수형은 double 형으로 인식
		double dnum = 3.14;
		// 실수를 float형으로 취급하려면 숫자값 뒤에 f를 붙여줘야한다.
		float  fnum = 3.14f; //float타입에선 3.14이 들어갈 수 없으니까 f형이라고표시를 해줌
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//실수를 부동소수점으로 표현하면 생기는 문제
		
		
		// 책 예제
		double /*변수 더블형으로 선언*/ dval=1;
		
		for (int i =0; i < 10000; i++) {
			dval = dval+0.1;
		}
		System.out.println(dval);
		
		// 교수님.. 무슨 말씀을 하시는건가요..?
		
		
		
		
		
	}

}
