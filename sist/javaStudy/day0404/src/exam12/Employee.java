package exam12;

public class Employee {
	private String name;
	private String tel;
	private int salary;
	
	public void printProfile() {
		System.out.println(name+"´Ô,"+"\t"+
							"ÀüÈ­¹øÈ£: " + tel+"\t"+
							"¿¬ºÀ: "+salary);
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
		this("±è¼ÒÀ±", "010-0000-0000", 4000);
	}
	public Employee(String name, String tel, int salary) {
		this.name = name;
		this.tel = tel;
		this.salary = salary;
	}



	
	
	
	
}
