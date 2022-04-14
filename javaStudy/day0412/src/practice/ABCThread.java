package practice;

class A extends Thread {
	public void run() {
		int count = 10;
		while (count > 0) {
			
			System.out.print("A"+count+" ");
			count--;
			
		}
	}
}

class B extends Thread {
	public void run() {
		int count = 10;
		while (count >0) {
			System.out.print("B"+count+" ");
			count--;
		
		}
		
	}
}

class C extends Thread {
	public void run() {
		int count = 10;
		while (count >0) {
			System.out.print("C"+count+" ");
			count--;
			
		}
	}
}


public class ABCThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		B b = new B();
		A a = new A();
		

		c.start();
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
