package exam06;

public class Magazine extends Book {
	
	private String releaseDate;

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Magazine(String title, int page, String writer, String releaseDate) {
		super(title, page, writer);
//		this.title = title;
//		this.page = page;
//		this.writer = writer;
		this.releaseDate = releaseDate;
	}

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(String title, int page, String writer) {
		super(title, page, writer);
		// TODO Auto-generated constructor stub
	}
	
}
