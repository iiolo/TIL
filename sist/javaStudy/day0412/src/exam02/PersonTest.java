package exam02;

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


public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		
		//p1.run();
		//p2.run();
		
		p1.start();
		p2.start();
	}
}
