/*
 * do{
 *    반복실행할 문장
 * }while (조건식)
 * 
 * 반복 조건 체크를 뒤에서 한다. 수행문을 반드시 한 번 실행해야 할 경우 사용한다.
 * 
 * 
 */

package chapter04;

public class A06_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		do {
			System.out.println(num);
			num++;
		}while (num<=5);
		
		/*
		while조건문은 조건문이 만족하지 않으면 {} 안에의 계산을 하나도 안하는데,
		do-while은 일단 {}한번 하고 뒤에 while의 조건을 따진다.*/

	}

}
