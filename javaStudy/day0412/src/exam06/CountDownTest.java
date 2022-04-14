package exam06;

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

public class CountDownTest {
	public static void main(String[] args) {
		CountDown cd = new CountDown(20);
//		cd.start();
		(new Thread(cd)).start();
	}
}