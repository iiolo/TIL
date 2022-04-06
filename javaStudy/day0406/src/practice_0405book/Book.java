package practice_0405book;

public class Book {
	String title;			//도서명을 위한 맴버변수
	int score;				//평점을 위한 맴버변수
	static int count;		//모든 도서의 수를 저장하기 위한 클래스 변수
	public Book(String title, int score) {	//생성자
		super();
		this.title = title;
		this.score = score;
		count++;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
		count++;
	}
	@Override
	public String toString() {			//도서의 정보를 문자열로 반환하는 메소드
		return "title=" + title + ", score=" + score + "";
	}	
}
