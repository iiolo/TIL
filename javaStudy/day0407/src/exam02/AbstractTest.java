package exam02;

abstract class A{
	public void test() {
		System.out.println("test�Դϴ�.");
	}
	public abstract void pro();
	public abstract void hello();
}


public class AbstractTest {
	public static void main(String[] args) {		
		A ob = new A() {
			public void pro() {
				System.out.println("pro�Դϴ�.");
			}
			public void hello() {
				System.out.println("hello�Դϴ�.");
			}
		};
		//�߻�Ŭ���� A�� ��ӹ��� �̸����� Ŭ������ �����ϸ鼭 �ٷ� ��ü�� �����մϴ�.
		//�߻�Ŭ���� A�� �ִ� �߻�޼ҵ带 �������̵� �ؾ� �մϴ�.
		
		ob.pro();
		ob.hello();
		ob.test();
	}

}