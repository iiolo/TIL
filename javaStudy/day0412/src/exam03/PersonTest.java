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
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("�̼���");
		
//		p1.start(); //Runnable�������̽����� start�� �����!
//		p2.start();
		
		//Runnable �������̽��� ������ ��ü�� �����带 ������Ű�� ���ؼ���
		//ThreadŬ������ ��ü�� ������ �� �����ؾ� �մϴ�.
		
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		t1.start();
//		t2.start();
		
		(new Thread(p1)).start();
		(new Thread(p2)).start();
		
	}
}