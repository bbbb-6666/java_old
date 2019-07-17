package chapter04;

import java.util.Scanner;

public class PR01_findmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 세 개 숫자를 입력받아  가장 큰 숫자를 출력하라.
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.println("첫번째 숫자를 입력해주세요");
		num1=  sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		num2= sc.nextInt();
		System.out.println("세번째 숫자를 입력해주세요");
		num3= sc.nextInt();
		
		//최댓값 찾기
		max = num1;  //제일 먼저 들어오는 숫자가 가장 큰 숫자라 가정.
		if(num2 > max) max=num2; //두번째 들어오는 애가 num1보다 크다면 max를 대체해줌
		if(num3 > max) max=num3; // "="의 의미는 대입의 뜻.
		
       System.out.println("가장 큰 숫자는"+max+"입니다.");
} }
