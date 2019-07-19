//배열

package chapter07;

public class ArrayTest {
	/*
	    배열 선언하는 방법
	    1. 자료형 : 대괄호를 이용해 표시 []
	 *     1.1 자료형[] 배열이름 = new 자료형[갯수]
	 *     1.2 자료형   배열이름[] = new 자료형[갯수]  //갯수=배열의 크기
	*/
	

	  //메인메소드
	  public static void main(String[] args) {
	  //1.1 : int[] studentIDs = new int[10];
	  //1.2 : 
	          //int studentIDs[] = new int[10];
	         
		  //선언과 동시에 배열을 초기화 하려면
		  int studentIDs[] = new int[] {100, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		  //위에처럼 쓰면 잘 뜸.
		  //int studentIDs[] = new int[] {10, 9, 8, 7, 6, 5, 4};
		  //위에 처럼 쓰면 배열의 바운드가 인덱스를 넘어갔습니다. 라는 오류의 문장이뜸.
	      //String studentIDs[] = new String[10]; //이건 안됨.
	     /*    for(int i=0, num=10; i<10; i++, num--) {
	        	 studentIDs[i] = num;
	         }*/
		/*
		 * studentIDs[0]=10; 
		 * studentIDs[1]=9;
		 */
	  /*
	  System.out.println(studentIDs[0]);  
	  System.out.println(studentIDs[1]);  
	  */
	  /*
	          for(int i=0;i<10;i++)
	        	  System.out.printf("%3d", studentIDs[i]);
	          */
	          for(int i=0; i<studentIDs.length; i++){
	          System.out.printf("%3d", studentIDs[i]);
	        }
	        

	
	  }}
