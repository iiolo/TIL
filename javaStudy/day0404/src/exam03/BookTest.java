package exam03;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		
		// public title, author �� ��� 
//		b.title="Great Java";
//		b.author = "bob";
		
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		
		b.printBook();

	}

}
