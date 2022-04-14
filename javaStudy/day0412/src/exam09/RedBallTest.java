package exam09;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class RedBall extends JPanel implements Runnable {
	// ���� ��ġ�� ������ ���� ����
	private int x = 10;
	private int y = 200;

	@Override
	protected void paintComponent(Graphics g) {
		
		// �θ� �ִ� paintComponent ȣ�������ν� ���ο� ��ȭ���� �����ϰ� �׷��༭(ȭ���� �����༭) �ܻ� ����
		super.paintComponent(g);

		// ���������� ���� ����
		g.setColor(Color.red);

		// ä�� �� �׸�
		g.fillOval(x, y, 30, 30);
	}

	public void run() {
		// ��� ����
		while (true) {
			x = x + 10;
			y = y - 10;

			try {
				Thread.sleep(100);
				repaint();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

class MyFrame extends JFrame {
	RedBall rb;

	public MyFrame() {
		rb = new RedBall();
		add(rb);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// rb.start();
		(new Thread(rb)).start();
	}
}

public class RedBallTest {

	public static void main(String[] args) {
		new MyFrame();

	}

}
