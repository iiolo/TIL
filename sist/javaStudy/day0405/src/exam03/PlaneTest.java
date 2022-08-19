package exam03;

class Plane{
	private String producer;
	private String model;
	private int max;
	
	//Ŭ���������� ��ü�� �����ϰ� Ŭ�����̸����� �����ؾ� �ϱ� ���� public���� ����ϴ�.
	public static int planes;
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Plane(String producer, String model, int max) {
		super();
		this.producer = producer;
		this.model = model;
		this.max = max;
		planes++;
	}
	public Plane() {
		super();
		// TODO Auto-generated constructor stub
		planes++;
	}
	
	public static int getPlanes() {
		return planes;
	}
	
}

public class PlaneTest {
	public static void main(String[] args) {
		System.out.println("������� ������� �� :"+Plane.getPlanes());
		Plane p1 = new Plane();
		System.out.println("������� ������� �� :"+Plane.getPlanes());
		Plane p2 = new Plane("�������", "A380", 500);
		System.out.println(p1.getProducer()+","+p1.getModel()+","+p1.getMax());
		System.out.println(p2.getProducer()+","+p2.getModel()+","+p2.getMax());
		
		p1.setProducer("����");
		p1.setModel("����747");
		p1.setMax(300);
		System.out.println("---------------------------------------------------");
		System.out.println(p1.getProducer()+","+p1.getModel()+","+p1.getMax());
		System.out.println(p2.getProducer()+","+p2.getModel()+","+p2.getMax());
		
		System.out.println("������� ������� �� :"+Plane.getPlanes());
		
	}

}
