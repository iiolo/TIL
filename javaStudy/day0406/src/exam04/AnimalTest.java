package exam04;

abstract class Animal {
	public abstract void move();//�������̵� ������ �ο�
	public void pro() {// �������̵� ���� �ƴ�, �ص� �ǰ� ���ص� �ǰ�
		
	}
}

class Lion extends Animal {
	public void move() {
		System.out.println("���ڴ� �׹߷� �Ȱų� �پ �����Դϴ�.");
	}
}
class Snake extends Animal {
	public void move() {
		System.out.println("���� �� �����Դϴ�.");
	}
}
class Bird extends Animal {
	public void move() {
		System.out.println("���� ���Ƽ� �����Դϴ�.");
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
