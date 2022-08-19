package exam06;

public class Rectangle {
	private double width;
	private double length;

	// constructor
	public Rectangle() {
		width = 10;
		length = 10;
	}
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
	// w�� ���� ���α��� �ʱ�ȭ, l�� ���� ���� ���� �ʱ�ȭ
	public Rectangle(String type, double v) {
		// type: w, l
		if (type.equals("w")) {
			width = v;
			length = 10;
		} else if(type.equals("l")){
			width = 10;
			length = v;
		}
	}

	// �Ű������� ������ �ڷ����� �ߺ��Ǳ� ������ ���� �߻�
//	public Rectangle(double w) { // ���� ���̸� �ʱ�ȭ
//		width = w;
//
//	}
//
//	public Rectangle(double l) { // ���� ���̸� �ʱ�ȭ
//
//		length = l;
//	}

	// method
	//setter
	public void setWidth(double w) {
		width = w;
	}

	public void setLength(double l) {
		length = l;
	}
	
	//getter
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double calcArea() {
		return width * length;
	}
}
