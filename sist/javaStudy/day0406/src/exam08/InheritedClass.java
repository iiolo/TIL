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

	private int hobong; // ȣ��
	private int base;// �⺻��
	private int extraPay; // ����

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
//		int n = 0; // �迭�� �ε����� ���� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.������ ���, 2.�ð��� ���, 0.���� : ");
			type = sc.nextInt();
			
			if (type == 0) {
				break;
			}
			String name;
			int no;
			System.out.print("����� �̸�: ");
			name = sc.next();
			System.out.print("����� ��ȣ: ");
			no = sc.nextInt();
			if (type == 1) {
				int hobong;
				System.out.print("ȣ���� �Է��ϼ���: ");
				hobong = sc.nextInt();
//				arr[n++] = new SalariedEmployee(name, no, hobong);
				list.add(new SalariedEmployee(name, no, hobong));
				
				
			} else if (type == 2) {
				int base, hours;
				System.out.print("�ð��� �޿��� �Է��ϼ���: ");
				base = sc.nextInt();
				System.out.print("���� �ð��� �Է��ϼ���: ");
				hours = sc.nextInt();
//				arr[n++] = new HourlyEmployee(name, no, base, hours);
				list.add(new HourlyEmployee(name, no, base, hours));
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		
		// �迭�� ���� : length
		//����Ʈ�� ���� : size();
		// 
		
		// �޿� ��� �� ���
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			e.computeSalary();
			System.out.println(e);
		}

	}

}
