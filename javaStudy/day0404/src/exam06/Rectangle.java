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
	
	// w가 오면 가로길이 초기화, l이 오면 세로 길이 초기화
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

	// 매개변수의 개수와 자료형이 중복되기 때문에 오류 발생
//	public Rectangle(double w) { // 가로 길이만 초기화
//		width = w;
//
//	}
//
//	public Rectangle(double l) { // 세로 길이만 초기화
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
