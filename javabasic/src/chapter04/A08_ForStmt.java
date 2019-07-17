/*
 * 반복문 중 가장 많이 사용하는 반복문
 * 주로 조건이 횟수인 경우에 사용
 * 초기화식, 조건식, 증감식을 한번에 작성한다.
 * 
 * for(초기화식;조건식;증감식){
 *    반복 수행할 문장
 * }
 * 
 * 그외 추가 설명 및 예제
 * - for 루프를 이용한 문자(알파벳, 한글) 출력하기
 * - 무한 루프
 * - for 루프에서 다중 변수 선언하기
 * - 다중 for 루프
 * - continue, break
 */
package chapter04;

public class A08_ForStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// num이 1에서 부터 5일때까지 하나씩 증가하면서 출력하는 for문
		int num; 
		for(num=1;num<=5;num++) {
			System.out.println(num);
		}*/
		
		
		
		
		/*
		// num이 5에서 부터 1일때까지 하나씩 감소하면서 출력하는 for문
		
		int num; 
		for(num=5;num>=1;num--) {
			System.out.println(num);
		}*/
		
		
		
		
		/*
		//무한 루프 돌리긔
		int number =1;
		while(true) {
			System.out.println(number);
			number++; // 여기까지하면 무한루프 돌리는 것.
			if (number==101) break; // 숫자가 100일때 루프를 벗어나서 밑으로 옮겨라
			
		}
		System.out.println("프로그램 중단"); */
		
		
		
		
		/*
		// while 문을 이용함 구구단 만들기
		int i=1, j=1;
		//중첩된 반복문(while문) (혹은 nested while loop)
		while (i<=9) {
			System.out.println(i+"dan multiple");
			j=1;
			while (j<=9) {
				System.out.println(i + "*" + j + "="+ i*j);
				j++;
			}//while
			i++;
			System.out.println();
		}//while
		System.out.println("프로그램 중단");
	*/
		
		/*
		//포문을 이용한 구구단
		int i=1, j=1;
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "="+ i*j);
			}//inner for loop
			
		}//outer for loop
		*/
		
		
		/*
		//포문을 이용한 무한루프
		for(;;) {
			System.out.println("hello");
			
		}*/
		
		/*
		//
		for(int i=1, j=1; i<=3; i++, j+=2) {
			System.out.println(i+" : "+j);
			}
		*/	
		
		/*
		//continue 특정한 루프안에서 조건이 일치할 경우 포문의 처음으로 돌아가게 해주는것.
		for(int i=1; i<=10; i++) {
			if(i%2 ==0) continue;
			System.out.println(i);
			*/
		
		
		/*
		for(int j=1; j<=10; j++) {
			if(j==8) break;
			if((j%2)==0) continue;
			System.out.println(j);
		}*/
		
		
		
		

		
	}
	

}
	


