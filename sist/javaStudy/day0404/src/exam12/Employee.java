package exam12;

public class Employee {
	private String name;
	private String tel;
	private int salary;
	
	public void printProfile() {
		System.out.println(name+"��,"+"\t"+
							"��ȭ��ȣ: " + tel+"\t"+
							"����: "+salary);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		this("�����", "010-0000-0000", 4000);
	}
	public Employee(String name, String tel, int salary) {
		this.name = name;
		this.tel = tel;
		this.salary = salary;
	}



	
	
	
	
}
