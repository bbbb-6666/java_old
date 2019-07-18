package chapter04;

import java.util.Scanner;

public class SimpleBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처리하고자 하는 업무 :  1.입금, 2.출금 , 3.잔고, 4. 종료
		/* 이거 아님 ~~~~~~~~
		Scanner kbd = new Scanner(System.in);
		int in, outt, remain=0;
		
	    System.out.println("입금할 금액 입력(없으면 0이라고 입력)");
	    in = kbd.nextInt();
		
	    System.out.println("출금할 금액 입력(없으면 0이라고 입력)");
	    outt = kbd.nextInt();
	    
	    remain = remain + in - outt;
	    
	    System.out.println("고객님의 잔고는 "+remain+"원입니다.");
		*/
		
		/*
		 * 입금, 출금, 잔고조회 등의 간단한 은행업무를 수행할 수 있는 프로그램 작성.
		 * 단, 입금, 출금, 잔고조회, 종료 등 업무는 텍스트 메뉴를 이용해 선택하고
		 * 종료를 선택하기 전까지 프로그램은 무한 반복한다.
		 * Pseudo code
		 * 1. 필요로 하는 변수 선언
		 * 2. 작업번호가 3가 아닌 동안 반복
		 *  2.1 선택 메뉴 디스플레이
		 *  2.2 작업 종류 입력
		 *  2.3 작업 종류에 따라
		 *    2.3.1 입금의 경우 :
		 *          입금액을 입력받는다
		 *          입금액을 잔고에 누계한다.
		 *    2.3.2 출금의 경우 :
		 *          출금액의 입력받는다. 
		 *          (단, 잔고보다 작거나 같은 금액이어야 한다.)
		 *          출금액을 잔고에 누계한다.
		 *    2.3.3 잔고조회의 경우 :
		 *          잔고액을 출력한다.
		 * 3. 프로그램 종료
		 */
		
		Scanner kbd = new Scanner(System.in);
		int num, in, outt = 0, remain=0, end;
		
		System.out.println
	     ("작업종류를 선택해주십시오. 1-입금, 2-출금, 3-잔고확인, 4-종료");
	       num= kbd.nextInt();
		

		while(num!=4) {
		    switch (num) {
		      case 1 : 
			      System.out.println("입금할 금액 입력");
			      in = kbd.nextInt();
			      remain = remain+in-outt;
			      System.out.println
			      ("입금된 금액은 "+in+"원이며, "+"잔고는 "+remain+"원입니다.");
			      break;
		      case 2 :
		    	  System.out.println("출금할 금액 입력");
		    	  outt = kbd.nextInt();
		    	  if(outt<=remain)
		    		  System.out.println
		    		  ("출금된 금액은 "+outt+"원이며, "+"잔고는 "+remain+"원입니다.");
		    	  else if(outt>remain)
		    		  System.out.println
		    		  ("잔고보다 출금액이 크므로 출금할 수 없습니다.");
		    	  break;
		      case 3:
		    	  System.out.println
			  	("고객님의 잔고는 "+remain+"원입니다.");
			  break;
		    }//end switch
		    	System.out.println
		    	("작업종류를 선택해주십시오. 1-입금, 2-출금, 3-잔고확인, 4-종료");
		    	num= kbd.nextInt();		
	       }// while 
			System.out.println
		     ("종료되었습니다.");
		}
		
		
		
	}


