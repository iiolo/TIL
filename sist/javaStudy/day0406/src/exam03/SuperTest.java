package exam03;
class A{
	String title = "hello";
	int year = 2022;
}

class B extends A {
	String title = "java";
	String addr = "서울";
	public void info() {
		System.out.println("year: "+year);
		System.out.println("addr: "+addr);
		System.out.println("title: "+title);
		System.out.println("부모의 title: "+super.title);
	}
	
}
public class SuperTest {

	public static void main(String[] args) {
		B ob = new B();
		ob.info();
	}

}
