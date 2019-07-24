package chapter07;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3]; //객체가 3개가 만들어질 것이다.
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();//북 인스턴스를 새로 만들어서 북어래이2에다가 대입을 함
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//깊은 복사
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor()); 
			//북어래이1의 i번째 요소의 작가이름을 가져옴
		}
		
		//배열복사 (얇은 복사)
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3); 
		
		//복사된 사본을 확인
		for(int i=0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
						
		//원본의 값을 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//원본의 값을 확인
		System.out.println("원본 배열 1");
		bookArray1[0].showBookInfo();
		
		//사본의 값을 확인
		System.out.println("사본 배열 1");
		bookArray2[0].showBookInfo();
		
		
		
		

	}

}
