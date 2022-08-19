package exam12;

import java.util.Random;

//��ǰ�� ���� Ŭ������ ����� ���ϴ�.
class Product{
	
	//�����߻��� ���� ������ü�� �����մϴ�.
	Random r = new Random();
	
	//�����ڴ� ����ؼ� ���ο� ������ ����� ���� 
	//�Һ��ڴ� �� ������ ������ ������ �ϰڽ��ϴ�.
	private int num;
	
	//���ο� ��ǰ�� ����Ǿ����� �Ǻ��� ������ ����ϴ�.
	//�����ڰ� ���ο� ��ǰ�� ����� true�� ���
	//�Һ��ڰ� ��ǰ�� �Һ��ϸ� false�� �㵵�� �մϴ�.
	boolean isNew;
	
	//������ ���� �޼ҵ�
	public synchronized void makeNumber() {
		
		//���� �Һ��ڰ� �Һ���� ���� ��ٷ���
		while(isNew == true) {
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//���ο� ��ǰ�� �����մϴ�.
		num = r.nextInt(100);
		
		System.out.println("�����ڰ� ���ο� ��ǰ�� �����Ͽ����ϴ�.===>"+num);
		
		//���ο� ��ǰ�� ����Ǿ��ٴ� ǥ�÷� isNew�� true�� �����մϴ�.
		isNew = true;
		
		//������� �Һ��ڸ� �����ݴϴ�.
		notify();
	}
	
	
	//�Һ� ���� �޼ҵ�
	public synchronized int useNumber() {
		
		//�����ڰ� ���ο� ��ǰ�� ������ �� ���� ��ٷ���		
		while( isNew == false   ) {
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		//�Һ�Ǿ��ٰ� ǥ���ϱ� ���Ͽ� isNew�� false�� �����Ѵ�.
		isNew = false;
		
		//������� �����ڸ� �����ش�.
		notify();
		
		System.out.println("�Һ��ڰ� ��ǰ�� �Һ��Ͽ����ϴ�. ===>" + num);
		return num;
	}
	
}

// ������ Ŭ������ ������.
class Producer extends Thread{
	
	//��ǰŬ������ �ɹ������� �����մϴ�.
	Product product;
	
	//�����ÿ� ��ǰ��ü�� ���޹޾�
	public Producer(Product product) {
		this.product = product;
	}
	
	//run�� �������̵� �Ͽ� �����尡 �ؾ��� ���� �� �ݴϴ�.
	public void run() {
		
		//10�� �ݺ��Ͽ� ���ο� ��ǰ�� �����ϵ��� �մϴ�.
		for(int i=0; i<10; i++) {
			product.makeNumber();
			try {
				Thread.sleep(200);
			}catch (Exception e) {

			}
		}
	}
	
}

// �Һ��� Ŭ����
class Consumer extends Thread{
	// ��ǰ�� ��������� ����
	private Product product;
	
	// ���� �� ��ǰ ���� ����
	 public Consumer(Product product) {
		this.product = product;
	}
	 
	// run�� �������̵� �Ͽ� �����尡 �ؾ� �� �� ����
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
// �����ڰ� ���ο� ��ǰ�� ����� = �Һ��ڰ� ��ǰ�� �Һ� �ߴ�.
// �� ��ǰ�� ����, ���� �Һ� x ==>+ true
// �Һ��� �Һ� �ϸ�, ���ο� ��ǰ ����x ==> false

public class ProducerAndConsumer {

	public static void main(String[] args) {
		// ��ǰ ��ü ����
		Product product = new Product();
		
		// ������ ��ü ����
		Producer pd = new Producer(product);
		
		// �Һ��� ��ü ����
		Consumer cs = new Consumer(product);
		
		// ������ ������ ����
		pd.start();
		
		// �Һ��� ������ ����
		cs.start();
	}

}
