package exam08;

import java.util.ArrayList;
import java.util.Scanner;

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
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		int type;
//		int n = 0; // 배열의 인덱스를 위한 변수
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.월급제 사원, 2.시간제 사원, 0.종료 : ");
			type = sc.nextInt();
			
			if (type == 0) {
				break;
			}
			String name;
			int no;
			System.out.print("사원의 이름: ");
			name = sc.next();
			System.out.print("사원의 번호: ");
			no = sc.nextInt();
			if (type == 1) {
				int hobong;
				System.out.print("호봉을 입력하세요: ");
				hobong = sc.nextInt();
//				arr[n++] = new SalariedEmployee(name, no, hobong);
				list.add(new SalariedEmployee(name, no, hobong));
				
				
			} else if (type == 2) {
				int base, hours;
				System.out.print("시간당 급여를 입력하세요: ");
				base = sc.nextInt();
				System.out.print("일한 시간을 입력하세요: ");
				hours = sc.nextInt();
//				arr[n++] = new HourlyEmployee(name, no, base, hours);
				list.add(new HourlyEmployee(name, no, base, hours));
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		// 배열의 길이 : length
		//리스트의 길이 : size();
		// 
		
		// 급여 계산 후 출력
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			e.computeSalary();
			System.out.println(e);
		}

	}

}
