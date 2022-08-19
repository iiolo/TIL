package exam02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.drawLine(10, 10, 100, 100);
		
		
		g.setColor(Color.blue);
		g.drawOval(10, 10, 100, 100);
		
		g.setColor(Color.green);
		g.drawRect(10, 10, 100, 100);
	}
	
}

// 그림판과 그림판 패널은 has a 관계
class Grimpan extends JFrame{
	// 그림판 패널을 멤버로 선언
	GrimpanPanel gp;
	
	
	public Grimpan(){
		gp = new GrimpanPanel();
		add(gp);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class GrimpanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grimpan();
	}

}
