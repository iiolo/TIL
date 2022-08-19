package exam11;

class Box{
	double width;
	double length;
	double height;
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		Box b = (Box)o;
		if(width == b.width && length == b.length && height == b.height ) {
			flag = true;
		}
		return flag;
	}
}

public class EqualsTest02 {
	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(10, 20, 30);
		
		// Box클래스에 equals메소드를 재정의 해 봅니다.
		// 완성하면 "1"
		if(b1.equals(b2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}			
	}

}
