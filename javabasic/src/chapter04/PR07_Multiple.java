/*
 * 사용자가 단을 입력하면 해당 단의 구구단을 출력하는 프로그램을 작성하시오.
 * 단, 0을 입력하면 프로그램을 종료하시오.
 */
package chapter04;

import java.util.Scanner;

public class PR07_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 변수 선언
		 * 2. 단이 0이 아닌동안 반복
		 *  2.1 단 입력 요구 메시지 출력
		 *  2.2 단 입력 받기
		 *  2.3 곱하는 수가 10보다 작은 동안 반복
		 *    2.3.1 단 * 곱하는 수 출력
		 * 3. 단 출력
		 */
		
		Scanner kbd = new Scanner(System.in);
		
		/*
		int i,j;
		
		  System.out.println("단을 입력해주세요");
		  i=kbd.nextInt();
		  
		while(i!=0) {
    	 for(; i<=9;)break; {
			for(j=1; j<=9; j++)
			System.out.println(i+"X"+j+"="+i*j);
		}//end of outer for 
    	  break;}//end of while 
		*/ // 이건 틀림 왜냐면 0을 입력하면 종료하는 기능이 들어가지 않았기 때문.
		
		
		int dan = 1;
		while(dan!=0) {
			System.out.println("몇 단?");
			dan=kbd.nextInt();
			if(dan==0)break;
			for(int times=1; times<10; times++) {
				System.out.println(dan+"*"+times+"="+ (dan*times));
				}//end for 
		}//end while
		
		System.out.println("프로그램 종료");
		
		
	}//end of main
}//end of class
