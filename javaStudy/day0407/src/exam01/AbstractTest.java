package exam01;

abstract class A{
	public void test() {
		System.out.println("test�Դϴ�.");
	}
	
	public abstract void pro();
}

class B extends A{

	@Override
	public void pro() {
		System.out.println("B�� pro�Դϴ�.");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
//		A ob = new A();
		//�߻�Ŭ������ ��ü�� ������ �� �����!
		
//		B ob = new B();
//		ob.pro();
		
		A ob = new B();
		ob.pro();
		
	}

}