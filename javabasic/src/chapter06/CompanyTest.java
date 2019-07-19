//싱글톤패턴 테스트
package chapter06;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메인 함수가 돌아야되니까 main 클릭
		
		Company myCompany1 = Company.getInstance(); 
		 //private으로 묶여있기 때문에 new Company로  접근할 수 없음.
		Company myCompany2 = Company.getInstance(); 
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
	}

}

/*
 * 5~6장 있는 '나 혼자 코딩' 다 코딩해오기 5~6장은 필수, 7장은 오늘 진도 나가는데까지 해오기
 */