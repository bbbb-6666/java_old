package chapter07;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열 선언
		
		// int[] array = 웅앵 : 일차원 배열 선언하는 방법 
		// int[][] arry = new int[2][3]; : 이건 이차원 배열 선언
		
		int [][] arry = {{1,2,3}, {4,5,6}}; //배열을 선언을 하면서 동시에 초기화
		
		for(int i=0; i<arry.length; i++) {
			for(int j=0; j<arry[i].length; j++) //어레이 행의 길이보다 작은 동안 계속 반복
				{System.out.printf("%3d", arry[i][j]);}
		
		System.out.println();
		//outer loop by i
	}System.out.println("2차원배열의 개념 확인");

}}
