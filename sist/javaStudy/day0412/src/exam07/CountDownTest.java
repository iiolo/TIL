package exam07;

class CountDown implements Runnable{	
	int start;	
	public CountDown(int start) {
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

class CountDownEvent extends Thread{
	
	int delay;
	String msg;
	
	public CountDownEvent(int delay, String msg) {
		this.delay = delay;
		this.msg = msg;
	}

	@Override
	public void run() {
		try {
				Thread.sleep(delay*1000);  
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(msg);
	}
	
}



public class CountDownTest {
	public static void main(String[] args) {
		CountDown cd = new CountDown(20);
//		cd.start();
		(new Thread(cd)).start();
		
		CountDownEvent cde = new CountDownEvent(2, "연결 장치 분리!!");
		cde.start();
	}
}
