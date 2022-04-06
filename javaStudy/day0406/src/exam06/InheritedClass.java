package exam06;

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

	private int hobong; // È£ºÀ
	private int base;// ±âº»±Þ
	private int extraPay; // ¼ö´ç

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
		SalariedEmployee e1 = new SalariedEmployee("±è¼ÒÀ±", 1001, 3);
		HourlyEmployee e2 = new HourlyEmployee("±èOO", 1002, 200000, 120);

		e1.computeSalary();
		e2.computeSalary();

		System.out.println(e1);
		System.out.println(e2);

	}

}
