package exam02;

abstract class A{
	public void test() {
		System.out.println("test입니다.");
	}
	public abstract void pro();
	public abstract void hello();
}


public class AbstractTest {
	public static void main(String[] args) {		
		A ob = new A() {
			public void pro() {
				System.out.println("pro입니다.");
			}
			public void hello() {
				System.out.println("hello입니다.");
			}
		};
		//추상클래스 A를 상속받은 이름없은 클래스를 정의하면서 바로 객체를 생성합니다.
		//추상클래스 A에 있는 추상메소드를 오버라이딩 해야 합니다.
		
		ob.pro();
		ob.hello();
		ob.test();
	}

}