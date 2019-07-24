/*
 * 2행 13열의 2차원 배열에 알파벳 26글자를 저장하고 출력하시오.
 * 
 * pseudo code
 * 
 * 1. char type의 2차원 배열 선언 13행 2열
 * 2. 배열 각 요소에 알파벳 소문자값 대입
 * 3. 배열 각 요소 출력 */
package chapter07;

public class SmallAlphabet_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[][] arr=new char[13][2];
		int ch=97; //97은 알파벳 소문자 a부터 시작하는 수.
		
		//배열채우기
		for(int i=0; i<13; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = (char)ch; //숫자 ch를 char로 강제 형변환
				ch++;
			}
		}
		
		//배열채우기
		for(int i=0; i<13; i++) {
			for(int j=0; j<2; j++) {
				System.out.printf("%2c", (char)arr[i][j]);
			}
			System.out.println();
		}
	}

}
