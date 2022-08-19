package exam07;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Àç¹ÌÀÖ´Â ÀÚ¹Ù", "±è¹ÎÇõ");
		
		// public title, author ÀÏ °æ¿ì 
//		b.title="Great Java";
//		b.author = "bob";
		
//		b.setTitle("Great Java");
//		b.setAuthor("bob");
		
		
		b1.printBook();
		b2.printBook();
//		b3.printBook();

	}

}
