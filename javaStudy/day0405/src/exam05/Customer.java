package exam05;

public class Customer extends Person {
	private int no;
	private int mileage;
	
	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name,addr,phone);//부모의 생성자를 요구함.
//		this.name = name;
		//아무리 자식클래스라 할지라도 부모의 private영역에는 접근할수 없어요!
		
		this.addr = addr;
		//외부의 다른 클래스로 부터는 보호하되
		//자식클래스들에게는 접근을 허용하기 위해서
		//protected를 이용합니다.
		
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
