package exam01;

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person();
//		kim.name = "�����";
//		kim.age = 28;
		kim.setName("�����");
		kim.setAge(25);

		System.out.println(kim.getName());
		System.out.println(kim.getAge());

		kim.wash("��Ǫ");
		kim.eat("����");

	}

}
