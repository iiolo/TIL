package exam07;

abstract class Employee {
	protected String name;
	protected int no;
	protected int salary;

	public Employee(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	abstract void computeSalary();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", salary=" + salary + "]";
	}

}


// SalariedEmployee is a Employee
class SalariedEmployee extends Employee {

	private int hobong; // 호봉
	private int base;// 기본급
	private int extraPay; // 수당

	public SalariedEmployee(String name, int no, int hobong) {
		super(name, no);
		this.hobong = hobong;

	}

	@Override
	void computeSalary() {
		switch (hobong) {
		case 1:
			base = 2500000;
			extraPay = 250000;
			break;
		case 2:
			base = 3000000;
			extraPay = 300000;
			break;
		case 3:
			base = 4000000;
			extraPay = 400000;
			break;

		}
		salary = base + extraPay;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [hobong=" + hobong + ", base=" + base + ", extraPay=" + extraPay + super.toString()
				+ "]";
	}

}

//HourlyEmployee is a Employee
class HourlyEmployee extends Employee {
	private int level;
	private int hours;
	private int base;

	public HourlyEmployee(String name, int no, int base, int hours) {
		super(name, no);
		this.base = base;
		this.hours = hours;
	}

	@Override
	void computeSalary() {
		salary = base * hours;

	}

	@Override
	public String toString() {
		return "HourlyEmployee [ hours=" + hours + ", base=" + base + super.toString() + "]";
	}

}

public class InheritedClass {

	public static void main(String[] args) {
		Employee []arr = new Employee[3];
		arr[0] = new SalariedEmployee("홍길동", 1001, 3);
		arr[1] = new HourlyEmployee("이순신", 1002, 300000, 10);
		arr[2] = new SalariedEmployee("유관순", 1003, 2);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].computeSalary();
			System.out.println(arr[i]);
		}

	}

}
