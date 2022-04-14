package exam04;

class Person extends Thread{	
	int start;	
	public Person(int start) {
		this.start = start;
	}
		
	@Override
	public void run() {
		for(int i=start; i >= 1 ; i--) {
			System.out.println(i + "초 전입니다");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
		}
		System.out.println("발사!!");
	}
	
}

public class PersonTest {
	public static void main(String[] args) {
		Person cd = new Person(20);
		cd.start();
	}
}