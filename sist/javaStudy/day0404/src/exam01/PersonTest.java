package exam01;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person();
//		kim.name = "±è¹ÎÇõ";
//		kim.age = 28;
		kim.setName("±è¼ÒÀ±");
		kim.setAge(25);

		System.out.println(kim.getName());
		System.out.println(kim.getAge());

		kim.wash("¼¤Çª");
		kim.eat("¿ìÀ¯");

	}

}
