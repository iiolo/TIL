package exam08;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class RedBall extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		// 빨간색으로 색상 설정
		g.setColor(Color.red);
		
		
		// 채운 원 그림
		g.fillOval(10, 200, 30, 30);
	}
	
}

class MyFrame extends JFrame{
	RedBall rb;
	public MyFrame() {
		rb =new RedBall();
		add(rb);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class RedBallTest {

	public static void main(String[] args) {
		new MyFrame();

	}

}
