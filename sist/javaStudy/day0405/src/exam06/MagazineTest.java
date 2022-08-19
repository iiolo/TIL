package exam06;

public class MagazineTest {
	public static void main(String[] args) {
		Book b = new Book("즐거운 자바", 600, "김민혁");
		Magazine m = new Magazine("월간자바", 300, "쌍용교육센터", "2022/04/05");
		
		System.out.println("도서명:"+b.getTitle()+
							",페이지수:"+b.getPage()+
							",저자:"+b.getWriter());
		
		System.out.println("도서명:"+m.getTitle()+
				",페이지수:"+m.getPage()+
				",저자:"+m.getWriter()+
				",발매일:"+m.getReleaseDate());
		
		
	}

}
