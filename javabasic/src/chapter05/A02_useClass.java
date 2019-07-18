/*
 * 클래스의 생성자 constructor
 * 클래스에는 여러개의 메소드가 있는데 그 중에서 생성자라는 메소드가 있음.
 * 생성자란, 클래스로부터 객체를 생성하는 과정을 생성이라는 표현을 쓴다.
 * 모든 클래스에는 기본적으로 생성자가 존재하는데 
 * 보통은 생성자는 자기 클래스 이름을 가지고 생성이 되어진다.
 * 스튜던트 클래스라고 하면 스튜던트라고 하는 콘스터럭터가 생성됨.
 * 메모리 공간을 안에 그 정보를 저장하기 위해 구체적인 공간이 만들어진 것을
 * 인스턴트화 된 거고 그 공간을 st1이라고 부를거다. 
 */

package chapter05;
/*
public class A02_useClass {
	public static void main(String[] args) {
	Student st1 = new Student();
	Student st2 = new Student();
	
	} // 이렇게 하고 컴트롤11 누르면 기본생성자 호출이 뜸.
	*/
	
	
	/*
	student 자바에서 	
	public Student() {
	System.out.println("기본 생성자 호출"); }

	
	이렇게 써놨기 때문에 여기서 이렇게 뜨는 것*/

/*
public class A02_useClass {
	public static void main(String[] args) {
	Student st1 = new Student();
	Student st2 = new Student("홍길동");
	st1.study();
	st2.study();
	}*/

/*
public class A02_useClass {
	public static void main(String[] args) {
	Student st1 = new Student();
	Student st2 = new Student("홍길동");
	Student st3 = new Student(1, "박문수", 4, "컴퓨터과", "청원구");
	st1.study();
	st2.study();
	st3.study();
	st3.showInfo();
	}
}
*/

public class A02_useClass {
	public static void main(String[] args) {
/*
		Student st1=new Student();
		st1.setname("민미리");
		st1.id=1;
		st1.address="우리집";
		//System.out.println(st1.getname());
		System.out.println(st1.id);
		System.out.println(st1.address);
		st1.showInfo();*/
		
		InfoHiding info=new InfoHiding();
		info.setId(1);
		System.out.println(info.getId()); //출력값 1
		
		//student의 string 에 private 을 걸어주면 name을 볼 수 없음. access 불가  

	}

	
	
}

