/*
 * while 반복구문
 * while(조건식) {반복수행할 문장;}
 */

package chapter04;

import java.util.Scanner;

public class A05_WhileStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 5까지의 수를 출력하는 프로그램을 작성하시오. 
		
		/* 1. 우리가 배운 증감연산자를 이용해서.
		int num =1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		*    하지만 이거는 작은 범위이고 큰 범위는 이렇게 할 수 없다.*/
		
		// 위 프로그램을 반복문을 이용하여 작성
		/*
		int num = 1;
		while (num<=5) {
			System.out.println(num);
		}
		이렇게 하면 1만 계속 찍힘*/
		
		/*
		int num = 1;
		while (num<=10000) {
			System.out.println(num);
			num++; // <이거를 추가해줘야함!
		}*/
		
		/*
		 * while문을 쓸 때 주의할 점
		 * 루프 안에서 반드시 조건식에 사용되어진 변수값을 변화시키는 부분이
		 * {}안에 반드시 들어가야한다.
		 * 조건식에 들어가는 변수를 제어변수라고 함.
		 */
		
		// 1~100까지 홀수의 합과 짝수의 합을 각각 구하시오.
		
		// 1. 필요한 변수의 값 선언
		// 2. 숫자가 100보다 작은지 확인
		//  2.1 숫자가 홀수이면 홀수의 합에 누계
		//  2.2 짝수이면 짝수의 합에 누계
		//  2.3 숫자를 증가시킨다.
		// 3. 홀수의 합계 출력
		// 4. 짝수의 합계 출력
		
		int num=1, oddsum=0, evensum=0;
		while(num<=100) {
			if((num%2)==0) evensum = evensum+num;
			else oddsum+=num;
			num++;
		}//end of while
		System.out.println("oddsum :" + oddsum);
		System.out.println("evensum :" + evensum);
		
		
		
		// 사용자로부터 시작숫자와 끝나는 숫자를 입력을 받아 
		// 시작숫자와 끝숫자의 범위 안에 있는 숫자들의 합계를 구하라 
		// Pseudo code
		/* 1. 필요한 변수 선언  : int num, start, end, num, total=0;
		 * 2. 시작숫자와 끝숫자를 입력 받는다.
		 * 3. num = start로 세트한다.
		 * 4. num가 end보다 작거나 같으면 반복
		 *   4.1 sum += start;
		 *   4.2 num++;
		 * 5.합계를 출력한다.
		 */
		
		/*
		//1.
		Scanner sc= new Scanner(System.in);
		int start, end, number, total=0;
		
		//2.
		System.out.println("시작 숫자를 입력하세요");
		start = sc.nextInt();
		System.out.println("끝 숫자를 입력하세요");
		end = sc.nextInt();
		
		//3. 
		number=start;
		
		//4.
		while(number<=end) {
			total+= number;
			number++;
		}
		
		//5.
		System.out.println("시작 숫자와 끝 숫자의 합계는 " + total);
		*/
		
		//시작숫자와 끝숫자중에서 3과 5의 공배수를 출력하시오.
		// 둘다 만족하려면 논리연산자 &를 쓰면 됨.
		
		//1.
		Scanner kbd= new Scanner(System.in);
		int beginnum, endnum, numm;
		
		//2.
		System.out.println("시작 숫자를 입력하세요");
		beginnum = kbd.nextInt();
		System.out.println("끝 숫자를 입력하세요");
		endnum = kbd.nextInt();
		
		//3. 
		numm=beginnum;
		
		//4. 4.2 공배수를 찾아서 출력 
		while(numm<=endnum) {
			if(((num%3)==0)&&((num&5)==0)) 
				System.out.println("3과 5의 공배수는"+numm);
			numm++;
		}
		
		
		
	}

}
