package exam01;

abstract class A{
	public void test() {
		System.out.println("test입니다.");
	}
	
	public abstract void pro();
}

class B extends A{

	@Override
	public void pro() {
		System.out.println("B의 pro입니다.");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
//		A ob = new A();
		//추상클래스의 객체는 생성할 수 없어요!
		
//		B ob = new B();
//		ob.pro();
		
		A ob = new B();
		ob.pro();
		
	}

}