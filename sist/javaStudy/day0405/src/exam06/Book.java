package exam06;

public class Book {
	protected String title;
	protected int page;
	protected String writer;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Book(String title, int page, String writer) {
		super();
		this.title = title;
		this.page = page;
		this.writer = writer;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
