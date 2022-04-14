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
				Thread.sleep(100);	//컴퓨터를 0.1초 멈추도록 합니다.
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
		
		
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		Person p3 = new Person("김유신");
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(1);
//		p3.setPriority(10);
		p3.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
	}
}