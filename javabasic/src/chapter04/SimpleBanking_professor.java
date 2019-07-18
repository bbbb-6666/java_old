package chapter04;

import java.util.Scanner;

public class SimpleBanking_professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 필요한 변수 선언.
		int jobNumber=0, balance=0, workMoney=0;
		Scanner kbd = new Scanner(System.in);
		
		// 2. 작업번호가 4가 아닌동안 무한반복
		do {
			
			//2.1 선택메뉴 디스플레이 (작업종류 입력)
			System.out.println("1.입금 2.출금 3.잔고조회 4.종료");
			
			//2.2 작업종류 입력
			System.out.println("선택>>");
			jobNumber = kbd.nextInt();
			
			//2.3 작업종류에 따라 
			switch(jobNumber) {
			case 1: // 입금의 경우
				System.out.println("입금액>>");
				workMoney = kbd.nextInt();
				balance += workMoney;
				break;
			case 2: // 출금의 경우
				System.out.println("출금액>>");
				workMoney = kbd.nextInt();
				if(workMoney<=balance) balance -= workMoney;
				else System.out.println("잔고가 부족합니다.");
				break;
			case 3: // 잔고조회의 경우
				System.out.println("현재 잔고>>"+balance);
				break;
			case 4:
				break;
			default: //4가 아닌 5,6을 눌렀을 때
				System.out.println("선택을 다시 해주세요");
			}//end of switch
			
		}while (jobNumber!=4);
		
		//3. 프로그램 종료
		System.out.println("프로그램을 종료합니다.");
		
	}//end of main

}//end of class
