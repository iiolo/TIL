package exam07;

public class Book {
	private String title;
	private String author;
	
	//constructor
	public Book() {
		title = "제목없음";
		author = "저자없음";
	}
	public Book(String t) {
		title = t;
	}
	public Book(String t, String a) {
		title = t;
		author= a;
	}
	
//	public Book(String q, String v) {
//		if (q.equals("t")) {
//			title = v;
//			author = "저자없음";
//		} else if(q.equals("a")) {
//			title = "제목없음";
//			author = v;
//		}
//	}
	
	
	
	
	
	// setter
	public void setTitle(String t) {
		title = t;
	}
	public void setAuthor(String a) {
		author = a;
	}

	// getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public void printBook() {
		System.out.println("책 제목은 "+title+"이고 작가는 "+author+"입니다.");
	}
	
}
