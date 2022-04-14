package exam05;

class Person extends Thread{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello, "+name + " "+i);
			
			try {
				Thread.sleep(100);	//��ǻ�͸� 0.1�� ���ߵ��� �մϴ�.
			}catch (Exception e) {				
			}
		}
	}
	
}


public class CountDownTest {
	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		
		
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
		Person p3 = new Person("������");
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(1);
//		p3.setPriority(10);
		p3.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
	}
}