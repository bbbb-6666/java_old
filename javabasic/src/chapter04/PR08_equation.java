/*
 * 방정식 4x + 5y 는 =60의 모든 해를 구하는 프로그램을 작성
 * 단, x,y 10이하의 자연수여야 함.
 */
package chapter04;

public class PR08_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//다중 for문을 이용한 예제 
		//1. 필요한 변수 선언
		//2. x와 y의 구하기
		// 2.1 4x+5y=60 나오는 값 구하기
		// 2.2 if구문 4x+5y=60
		//3. x, y값 출력
		

		int x, y;
		
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++)
				if(4*x+5*y==60) 
				System.out.println(x+","+y);
		}//end for
		
		
		
		//1. x가 1부터 10보다 작거나 같은 동안 반복
		// 1.1 y가 1부터 10보다 작거나 같은 동안 반복
		//    1.1.1 4x+5y==60 이면 x,y를 출력
		
		/*
		 * for(int x=1; x<=10; x++){
		 *    for(int y=1; y<=10; y++) {
		 *       if((4*x+5*y)==60) System.out.println("해 x,y :" + x+","+y);
		 *       }//inner for
		 *   }outer for
		 */
		
	}

}
