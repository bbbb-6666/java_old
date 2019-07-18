package chapter04;

import java.util.Scanner;

public class PR05_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// p.123 Q1. 연습문제 1
		int num1, num2;
		String op;
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("숫자 1 : ");
		num1 = kbd.nextInt();
		
		System.out.println("숫자 2 : ");
		num2 = kbd.nextInt();				

		System.out.println("연산의 종류 : ");
		op = kbd.next();
		
		switch(op) {
		case "+" :
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		}
		System.out.println("종료!");*/
		
		
		//연습문제 2
		/*
		 * int dan, times = 0; for(dan=2; dan<=8; dan++) { for(times=1; times<=9;
		 * times++) if ((dan%2)==0); continue;
		 * 
		 * System.out.println(dan+"X"+times+"="+dan*times); } System.out.println( );
		 */
		
		/*
		int i, j; 
		for(i=1; i<=9; i++ ) {
            if((i%2)==1) continue;
			for(j=1; j<=9; j++)
				System.out.println(i+"X"+j+"="+i*j);
		}*/
		
		/*
		int i, j; 
		for(i=2; i<=9; i+=2 ) {
			for(j=1; j<=9; j++)
				System.out.println(i+"X"+j+"="+i*j);
		}*/
		
			
		
		//연습문제3 
			/*
		int dann, timmes=0;
		for(dann=1; dann<=9; dann++) {
			for(timmes=1; timmes<=dann;)
				break;
			System.out.println(dann+"X"+timmes+"="+dann*timmes);
		}*/
		
		/*// 
		int dann=1, timmes=1;
		for(dann=1; dann<=9; dann++) {
			for(timmes=1; timmes<=9; timmes++)
				if(dann <= timmes) break;
			System.out.println(dann+"X"+timmes+"="+dann*timmes);*/
		
	
	/*
    int n = 1, m = 1;
    for (n = 1; n<=9; n++) {
    for(m = 1; m<=9; m++) {
    if(n <= m) break;
    System.out.println(n + "*" + m + "=" + n*m);
    
    }*/
			

		
		
		
		
	}}


