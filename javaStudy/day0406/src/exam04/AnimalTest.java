package exam04;

abstract class Animal {
	public abstract void move();//오버라이딩 강제성 부여
	public void pro() {// 오버라이딩 강제 아님, 해도 되고 안해도 되고
		
	}
}

class Lion extends Animal {
	public void move() {
		System.out.println("사자는 네발로 걷거나 뛰어서 움직입니다.");
	}
}
class Snake extends Animal {
	public void move() {
		System.out.println("뱀은 기어서 움직입니다.");
	}
}
class Bird extends Animal {
	public void move() {
		System.out.println("새는 날아서 움직입니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Snake snake = new Snake();
		Bird bird = new Bird();
		
		lion.move();
		snake.move();
		bird.move();
	}

}
