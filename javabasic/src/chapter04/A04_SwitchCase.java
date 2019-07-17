/* 조건이 많아질 경우 if~else 구문이 길어서 불편함.
 * 조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행되는 경우 깔끔한 표현 가능함.
 * break 를 적어주는 이유 : case를 여러개 나열하는데, 브레이크가 안들어간다면, 
 * case들이 계속 진행이 됨. 그 케이스 구문들을 벗어날 수 있게, 종료할 수 있게(??) 해줌*/

package chapter04;

import java.util.Scanner;

public class A04_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*브레이크를 안 적은 경우
		int number1=1;
		
		switch(number1) {
		case 1: 
		     System.out.println("숫자1");
		case 2:
		     System.out.println("숫자2");
		case 3:
		     System.out.println("숫자3");
		     값이 숫자 1, 숫자 2, 숫자3 다 나옴*/
		/*
		int number1=2;
		
		switch(number1) {
		case 1: 
		     System.out.println("숫자1");
		     break;
		case 2:
		     System.out.println("숫자2");
		     break;
		case 3:
		     System.out.println("숫자3");
		     break;
		     */
		     /* 이 구문이 위의 구문으로 변경됨.
		      * if (number1 == 1){
		      * }else if(number 1==2){
		      * }else
		      */
		
		
		
		/*
		int number1=6;
		int remainder;
		remainder = number1 % 2;
		
		switch(remainder) {
		case 0: 
		     System.out.println("짝수 Even number");
		     break;
		case 1:
		     System.out.println("홀수 Odd number");
		     break;
		     // 넘버1에 들어가는 숫자가 2로 나눈 나머지가 리메인더인데
		     // 그 리메인더가 0인 경우와 1인 경우를 나눠서 값을 출력한다.
		     // 성적들도 스위치케이스 구문으로 할 수 있다.
		     default: 
		    	 break;
		     // 디폴트는 케이스값에 모두 해당되지 않는 값.
		}*/
		
		//임의의 숫자를 키보드를 통해 입력받아서 3, 4, 5의 배수를인지
		//판단해서 출력하고 아무것도 아니면 그 외의 경우입니다 라고 출력하기.
		
		Scanner sc = new Scanner(System.in);
		int number1;
		
		System.out.println("숫자를 입력해주세요");
		number1= sc.nextInt();
		
		if(number1 % 3==0) System.out.println("3의 배수입니다.");
		else if (number1 % 4==0) System.out.println("4의 배수입니다.");
		else if (number1 % 5==0) System.out.println("5의 배수입니다.");
		else System.out.println("이 외의 숫자의 배수입니다.");
			// 자바에서는 '='는 대입한다는 뜻, '==' 는 같다는 뜻.
		//case 문 사용하기에는 애매함.
		
		
	}

}
