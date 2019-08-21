package ch0;

import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String alpha;
		char e;
		
		System.out.println("소문자 알파벳 하나를 입력하세요");
		alpha=sc.next();
		e=alpha.charAt(0);
	
		for(int i=0; i<e-'a'; ++i) {
			for(char j='a'; j<=e-i; ++j) {
				System.out.print(j);}//end for j
			System.out.println();
			}//end for i
		  sc.close();
		}//end main

	}//end class


