package exam03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel implements MouseListener{

	int x1, y1, x2, y2;
	
	
	// �����ڿ��� ���콺 �̺�Ʈ ���
	public GrimpanPanel() {
		// �гο� ���콺 �̺�Ʈ ���
		 addMouseListener(this);
		
	}
	
	// �г��� �ٽ� �׷��� �ʿ䰡 ���� ���� paintComponent�� �ڵ� ����
	// paintComponent�� �������̵� �Ͽ� �׷��� ǥ��
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("�ٽ� �׷��ݴϴ�. ");
		g.drawLine(x1, y1, x2, y2);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	// ���콺�� �������� ���� x,y ��ǥ�� �׷����� ���������� ����
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		
		
		
	}

	// ���콺�� �������� ���� x,y ��ǥ�� �׷����� �������� ����
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		// �ٽ� �׷��ּ��� ��� ��û
		repaint();// paintComponent ����
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

// �׸��ǰ� �׸��� �г��� has a ����
class Grimpan extends JFrame{
	// �׸��� �г��� ����� ����
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
