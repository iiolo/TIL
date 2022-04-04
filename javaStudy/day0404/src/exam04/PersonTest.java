package exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person kim = new Person();

		System.out.println(kim.getName());
		System.out.println(kim.getAge());

		kim.wash("¼¤Çª");
		kim.eat("¿ìÀ¯");
		
		kim.setName("±èÀ¯½Å");
		kim.setAge(20);
		kim.eat("Ã»±¹Àå");

	}

}
