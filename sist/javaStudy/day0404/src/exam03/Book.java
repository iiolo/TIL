package exam03;

public class Book {
	private String title;
	private String author;
	
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
