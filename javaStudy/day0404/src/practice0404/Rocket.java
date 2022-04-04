package practice0404;

public class Rocket {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Rocket(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x: " + x + "\t" + "y: " + y;
	}

	public int moveUp() {
		return y + 1;
	}

}
