package practice0404;

public class Person {
	public String name;
	private String mobile;
	private String office;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person(String n, String m, String o, String e) {
		super();
		this.name = n;
		this.mobile = m;
		this.office = o;
		this.email = e;
	}

	public String toString() {
		return "이름: " + name + "\t" + "핸드폰 번호: " + mobile + "\t" + "직장 전화번호: " + office + "\t" + "이메일 주소: " + email;
	}

}
