package exam04;

class A {
	 String title;
	 int year;
	 public void pro() {
		 System.out.println("pro입니다.");
	 }
}

interface B{
	public void testB();
}

interface C{
	public void testC();
}

class D extends A implements B,C{

	@Override
	public void testC() {
		System.out.println("testC입니다.");
	}

	@Override
	public void testB() {
		System.out.println("testB입니다.");
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		D ob = new D();
		ob.title = "JAVA";
		ob.year = 2022;
		ob.pro();
		ob.testB();
		ob.testC();
	}
}