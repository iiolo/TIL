package exam03;

class Person implements Runnable{
	private String name;
	public Person(String name) {
		this.name = name;
	}	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello,"+name+" "+i);
			
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		
//		p1.start(); //Runnable인터페이스에는 start가 없어요!
//		p2.start();
		
		//Runnable 인터페이스를 구현한 객체를 쓰레드를 가동시키기 위해서는
		//Thread클래스의 객체를 생성한 후 가동해야 합니다.
		
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		t1.start();
//		t2.start();
		
		(new Thread(p1)).start();
		(new Thread(p2)).start();
		
	}
}