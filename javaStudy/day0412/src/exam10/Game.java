package exam10;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// �̻���, ��, �÷��̾� ���� Ŭ����
class GraphicObject {
	// �׸����� ������ ���� ����
	BufferedImage img = null;

	// �׸��� ����� ��ġ ���� ����
	int x = 0, y = 0;

	// �����ÿ� �׸����� ���� ���޹���
	public GraphicObject(String name) {

		try {// �׸������� �о���� �� ���ܰ� �߻��ϱ� ������ ����ó��
			img = ImageIO.read(new File(name));

		} catch (Exception e) {
			// ���� �߻� �� ���� �޼��� ���
			System.out.println("���ܹ߻�" + e.getMessage());

			// ���α׷� ����
			System.exit(0);
		}
	}

	// �׷����� ��ġ�� �����ϱ� ���� �޼ҵ� ����
	// body�� ��üȭ���� �ʾƼ� �ڽ� Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �Ѵ�
	public void update() {

	}

	// ����� ��ġ�� �׷����� �׷��ֱ� ���� �޼ҵ�
	// body�� ��üȭ���� �ʾƼ� �ڽ� Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �Ѵ�
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	// Ű���� �̺�Ʈ�� ó���ϱ� ���� �޼ҵ�
	// body�� ��üȭ���� �ʾƼ� �ڽ� Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �Ѵ�
	public void keyPressed(KeyEvent event) {

	}

}

// GraphicObject�� Ȯ���� �̻��� Ŭ����
class Missile extends GraphicObject {
	// �̻����� �׷��� �� ������ ���� ���� ����
	boolean launched = false;

	// ���� �ÿ� �̻����� �׸� ���� �̸� ���� ����
	public Missile(String name) {
		// �׸����� �̸��� �θ� �����ڿ��� ����
		super(name);

		// �̻����� y ��ǥ�� -200���� �����Ͽ� ȭ�鿡�� �Ⱥ��̵��� �Ѵ�.
		y = -200;
	}

	// �̻����� ��ġ�� �����ϱ� ���Ͽ� �θ��� update �޼ҵ� �������̵�
	@Override
	public void update() {
		// ���� �̻����� �߻� �� ���¶��(�׷���� �ϴ� ���¶��)
		// �̻����� ���� �����ϵ��� 1��ŭ ����Ͽ� ���ҽ�Ŵ
		if (launched == true) {
			y -= 50;
		}

		// ���� �̻����� ��ġ�� �����Ͽ� ȭ���� �������� ����ٸ�
		// �̻����� ȭ�鿡 �׸� �ʿ䰡 �����Ƿ� launched�� false ����
		if (y < -100) {
			launched = false;
		}

	}

	// Ű���尡 �������� �̺�Ʈ ó���� ���� �޼ҵ�
	// Ű���� �̺�Ʈ�� �̻����� ����� x,y ��ǥ�� �Ű������� ���޹���
	public void keyPressed(KeyEvent event, int x, int y) {

		// ������ Ű�� �����̽� ������ �Ǻ�
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {

			// �̻����� �߻��Ű�� ���Ͽ� launched �� true ����
			launched = true;

			// �̻����� ��� ��ġ ����
			this.x = x;
			this.y = y;
		}
	}

}

// ���� ���� Ŭ����
class Enermy extends GraphicObject {
	// ���� x�� �̵�����
	int dx = -10;

	// �����ÿ� ���� �׸����ϸ� ���޹���
	public Enermy(String name) {
		// �θ��� �����ڿ��� �׸����ϸ� ����
		super(name);

		// ���� ��ġ ����
		x = 200;
		y = 0;
	}

	// ���� ��ġ�� �����Ű�� ���� update �޼ҵ� �������̵�
	@Override
	public void update() {
		// x�����θ� �̵���Ű�� ���� x�� �̵��Ÿ��� dx ����
		x += dx;

		// ���� �̵������� �����ε� x��ġ�� 0���� �۾����� �̵������� ����� ����
		if (x < 0) {
			dx = +10;
		}

		// ���� �̵������� ����ε� x��ġ�� 500���� Ŀ���� �̵������� ������ ����

		if (x > 500) {
			dx = -10;
		}
	}

}

// �÷��̾ ���� Ŭ����
class SpaceShip extends GraphicObject {

	// ���� �ÿ� �׸����ϸ� ���޹���
	public SpaceShip(String name) {
		// �θ��� �����ڿ��� �׸����ϸ� ����
		super(name);

		// �÷��̾��� ��ġ ����
		x = 150;
		y = 300;

	}

	// Ű���� �̺�Ʈ ó���� ���� �޼ҵ� ����

	@Override
	public void keyPressed(KeyEvent event) {
		// ���� ���� Ű�� �����ٸ� x�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ŵ
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		// ������ ���� Ű�� �����ٸ� x�� ���� �������� �÷��̾� ��ġ�� ���������� �̵���Ŵ
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		// ���� ���� Ű�� �����ٸ� y�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ŵ
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		// �Ʒ��� ���� Ű�� �����ٸ� y�� ���� �������� �÷��̾� ��ġ�� �������� �̵���Ŵ
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}

}

// ��, �÷��̾�, �̻����� �׷������� ǥ���ϱ� ���� �г� Ŭ���� �����
// Ű���� �̺�Ʈ ó���� ���Ͽ� KeyLister �������̽� ����
class MyPanel extends JPanel implements KeyListener {
	// ������ ��������� ��, �÷��̾�, �̻��� ��ü�� ��� ������ ����
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;

	public MyPanel() {
		// Ű��Ʈ �̺�Ʈ ���
		addKeyListener(this);

		// �����̳� ������ �гο� Ű���� �̺�Ʈ�� ����ϱ� ���� ������ �޼ҵ� ȣ��
		requestFocus();
		setFocusable(true);

		// ���� ���� ��ü ����
		enermy = new Enermy("enemy.png");

		// �÷��̾ ���� ��ü ����
		spaceship = new SpaceShip("player.png");

		// �̻����� ���� ��ü ����
		missile = new Missile("misile.png");

		// ��. �÷��̾�, �̻����� ���� ���� ���ع��� �ʰ� �׷����� ǥ���ϵ��� thread class ����
		// �� Ŭ������ �ٸ� ���� ���� �� ���� ���� �гο����� �ʿ�, �� �� Ŭ������ Ŭ���� �ȿ� ���� ���� : inner class
		class MyThread extends Thread {
			// run�� �������̵� �Ͽ� �����尡 �ؾ� �� ���� �� �ش�.
			public void run() {
				// ��� �ݺ��Ͽ� ��, �÷��̾�, �̻����� ��ġ�� �����Ͽ� �ٽ� �׸���.
				while (true) {
					enermy.update();// �� ��ġ ����
					spaceship.update();// �÷��̾� ��ġ ����
					missile.update();// �̻��� ��ġ ����
					repaint(); // ����� ��ġ�� �ٽ� �׷���
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				

			}
			// end run
		}// end thread
			// ������ ��ü ����
		Thread t = new MyThread();

		// ������ ����
		t.start();
	}

// �гο� �׷����� ǥ���ϱ� ���� paint �޼ҵ� �������̵�
	@Override
	public void paint(Graphics g) {
		// �θ��� paint�� ȣ���Ͽ� ȭ���� ������ �����.
		super.paint(g);

		// �� �׸���
		enermy.draw(g);

		// �÷��̾� �׸���
		spaceship.draw(g);

		// �̻��� �׸���
		missile.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// Ű���尡 �������� �� ������ �޼ҵ� ����
	@Override
	public void keyPressed(KeyEvent e) {
		// Ű���尡 �������� �÷��̾��� ��ġ�� �����ϵ��� �޼ҵ� ȣ��
		spaceship.keyPressed(e);

		// Ű���尡 �������� �̻����� �߻��Ű�� ���� �޼ҵ� ȣ��
		// ���� �÷��̾��� ��ġ���� �̻����� �߻�ǵ��� �÷��̾��� ��ġ�� ���� ����
		missile.keyPressed(e, spaceship.x, spaceship.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

//�������� ���� Ŭ���� �����
class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("My Game");
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}

}

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
