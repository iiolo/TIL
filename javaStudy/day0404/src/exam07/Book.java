package exam07;

public class Book {
	private String title;
	private String author;
	
	//constructor
	public Book() {
		title = "�������";
		author = "���ھ���";
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
//			author = "���ھ���";
//		} else if(q.equals("a")) {
//			title = "�������";
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
		System.out.println("å ������ "+title+"�̰� �۰��� "+author+"�Դϴ�.");
	}
	
}
