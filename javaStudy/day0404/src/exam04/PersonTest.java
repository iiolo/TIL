package exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person kim = new Person();

		System.out.println(kim.getName());
		System.out.println(kim.getAge());

		kim.wash("��Ǫ");
		kim.eat("����");
		
		kim.setName("������");
		kim.setAge(20);
		kim.eat("û����");

	}

}
