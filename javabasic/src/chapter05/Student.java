package chapter05;


public class Student{
	int id;
	private String name;
	int grade;
	String dept;
	String address;
	
	public Student() {
		System.out.println("기본 생성자 호출");
	}
	
	//두번째 생성자, 이름을 패러미터로 가지는 생성자
	public Student(String p_name) {
		name = p_name;
		System.out.println("이름을 가진 생성자 호출!");
	}
		
	//위에 두개가 같은 생성자이지만 두개는 다른 거임.
	//다형성은 위에 두개를 가지고 설명 
	
	//풀 패러미터 생성자
	public Student
	   (int p_id, String p_name, int p_grade, String p_dept, String p_address)
	{ id=p_id;
	  name=p_name;
	  grade=p_grade;
	  dept= p_dept;
	  address = p_address;
		System.out.println("full parameter 생성자 호출!!");
	}
	
	
	public void setname (String pname) {
		name=pname;
	}
	
	
	public String getname() {
		return name; 
	}
	
	
	public void study() {
		System.out.println(name +"이"+dept+ "과를 공부한다.");} 
		
		public void showInfo() {
			System.out.println(id + " , " + name +  " , " + grade + " , " +dept+ " , " +address); 
	} //이거 세줄은 메소드
	
	
} 
// 현재 지금 student 클래스에 메인 함수가 없음.
//run-run con웅앵웅 > main 지우고 어플라이 지우고 
//종료하고 다시 컨트롤 11 누르면 오류 남.오류: 기본 클래스 을(를) 찾거나 로드할 수 없습니다.
