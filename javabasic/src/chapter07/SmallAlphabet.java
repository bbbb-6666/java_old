//이거는 내껀데 실패함.
package chapter07;

public class SmallAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] alpha = new char[13][2];
		char ap ='a';

		for(char i=0; i<alpha.length; i++, ap++) {
			for(char j=0; j<alpha.length; j++,  ap++);
			alpha[i] = ap;
		}
				
		for(char i=0; i<alpha.length; i++, ap++) {
			for(char j=0; j<alpha[i].length; j++, ap++) {
			System.out.println(alpha[i][j]);
			}
			System.out.println();
		}
	}

}
