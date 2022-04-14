package exam03;

interface A{
	public int a = 10;
	public void pro();
}

interface B{
	public int b = 20;
	public void test();
}

class C implements A, B{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	@Override
	public void pro() {
		// TODO Auto-generated method stub
		System.out.println("pro");
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob = new C();
		ob.pro();
		ob.test();
	}

}