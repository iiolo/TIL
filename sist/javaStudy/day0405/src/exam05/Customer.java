package exam05;

public class Customer extends Person {
	private int no;
	private int mileage;
	
	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name,addr,phone);//�θ��� �����ڸ� �䱸��.
//		this.name = name;
		//�ƹ��� �ڽ�Ŭ������ ������ �θ��� private�������� �����Ҽ� �����!
		
		this.addr = addr;
		//�ܺ��� �ٸ� Ŭ������ ���ʹ� ��ȣ�ϵ�
		//�ڽ�Ŭ�����鿡�Դ� ������ ����ϱ� ���ؼ�
		//protected�� �̿��մϴ�.
		
		this.no =no;
		this.mileage = mileage;
	}
	
	public Customer() {		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
