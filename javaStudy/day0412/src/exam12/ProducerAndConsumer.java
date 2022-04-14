package exam12;

import java.util.Random;

//제품에 대한 클래스을 만들어 봅니다.
class Product{
	
	//난수발생을 위한 랜덤객체를 생성합니다.
	Random r = new Random();
	
	//생산자는 계속해서 새로운 정수를 만들어 내고 
	//소비자는 그 정수를 가져다 쓰도록 하겠습니다.
	private int num;
	
	//새로운 제품의 생산되었는지 판별할 변수를 만듭니다.
	//생산자가 새로운 제품을 만들면 true에 담고
	//소비자가 제품을 소비하면 false를 담도록 합니다.
	boolean isNew;
	
	//생산을 위한 메소드
	public synchronized void makeNumber() {
		
		//아직 소비자가 소비안한 동안 기다려요
		while(isNew == true) {
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//새로운 제품을 생산합니다.
		num = r.nextInt(100);
		
		System.out.println("생산자가 새로운 제품을 생산하였습니다.===>"+num);
		
		//새로운 제품이 생산되었다는 표시로 isNew에 true를 저장합니다.
		isNew = true;
		
		//대기중인 소비자를 깨워줍니다.
		notify();
	}
	
	
	//소비를 위한 메소드
	public synchronized int useNumber() {
		
		//생산자가 새로운 제품을 생산할 때 까지 기다려요		
		while( isNew == false   ) {
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		//소비되었다고 표시하기 위하여 isNew에 false를 저장한다.
		isNew = false;
		
		//대기중인 생산자를 깨워준다.
		notify();
		
		System.out.println("소비자가 제품을 소비하였습니다. ===>" + num);
		return num;
	}
	
}

// 생산자 클래스를 만들어요.
class Producer extends Thread{
	
	//제품클래스를 맴버변수로 선언합니다.
	Product product;
	
	//생성시에 제품객체를 전달받아
	public Producer(Product product) {
		this.product = product;
	}
	
	//run을 오버라이딩 하여 쓰레드가 해야할 일을 써 줍니다.
	public void run() {
		
		//10번 반복하여 새로운 제품을 생산하도록 합니다.
		for(int i=0; i<10; i++) {
			product.makeNumber();
			try {
				Thread.sleep(200);
			}catch (Exception e) {

			}
		}
	}
	
}

// 소비자 클래스
class Consumer extends Thread{
	// 제품을 멤버변수로 선언
	private Product product;
	
	// 생성 시 제품 전달 받음
	 public Consumer(Product product) {
		this.product = product;
	}
	 
	// run을 오버라이딩 하여 쓰레드가 해야 할 일 써줌
	 public void run() {
		for (int i = 0; i < 10; i++) {
			product.useNumber();
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}



// isNew
// 생산자가 새로운 제품을 만든다 = 소비자가 제품을 소비 했다.
// 새 제품이 생산, 아직 소비 x ==>+ true
// 소비자 소비를 하면, 새로운 제품 생산x ==> false

public class ProducerAndConsumer {

	public static void main(String[] args) {
		// 제품 객체 생성
		Product product = new Product();
		
		// 생산자 객체 생성
		Producer pd = new Producer(product);
		
		// 소비자 객체 생성
		Consumer cs = new Consumer(product);
		
		// 생산자 쓰레드 가동
		pd.start();
		
		// 소비자 쓰레드 가동
		cs.start();
	}

}
