package exam09;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class RedBall extends JPanel implements Runnable {
	// 공의 위치를 저장할 변수 선언
	private int x = 10;
	private int y = 200;

	@Override
	protected void paintComponent(Graphics g) {
		
		// 부모에 있는 paintComponent 호출함으로써 새로운 도화지로 깨끗하게 그려줘서(화면을 지워줘서) 잔상 제거
		super.paintComponent(g);

		// 빨간색으로 색상 설정
		g.setColor(Color.red);

		// 채운 원 그림
		g.fillOval(x, y, 30, 30);
	}

	public void run() {
		// 계속 진행
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
