package exam13;

public class Cellphone {
	private String model;
	private String company;
	private String color;
	private boolean power;
	private boolean camera;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean isCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public Cellphone(String model, String company, String color, boolean power, boolean camera) {
		this.model = model;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}
	public Cellphone() {
		this("Iphone 12 mini", "Apple","Navy",false,true);
	}
	
	
}
