package practice0412;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

// �ϳ��� �׷����� ������ ǥ���ϱ� ���� Ŭ����
class GraphicInfo {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public GraphicInfo(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

}

//�׷����� ǥ���ϱ� ���Ͽ� JPanel�� ����� Ŭ������ ����� �ְ� 
//��, ���콺 �̺�Ʈ ó���� ���Ͽ� MouseListener�� �����մϴ�.
class GrimpanPanel extends JPanel implements MouseListener {

	// �׷��� �׷����� ������ ��� ���� ����Ʈ ����
	ArrayList<GraphicInfo> list;

	int x1, y1, x2, y2;
	// ���콺�� ������ ������, ������ �����ϱ� ���� ������ �����մϴ�.

	// �����ڿ��� ���콺�̺�Ʈ�� ����մϴ�.
	public GrimpanPanel() {
		// �׷��� �׷����� ������ ��� ���� ����Ʈ ����
		list = new ArrayList<GraphicInfo>();

		// �гο� ���콺 �̺�Ʈ�� ����մϴ�.
		addMouseListener(this);
	}

	// �г��� �ٽñ׷��� �ʿ䰡 �������� paintComponent�� �ڵ����� �����մϴ�.
	// paintComponent�� �������̵� �Ͽ� �׷����� ǥ�� �� �ݴϴ�.
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("�ٽ� �׷��ݴϴ�");
		System.out.println("�׷����� ��: " + list.size());

		// ����Ʈ�� ��� �׷��� ������ŭ �׷���
		for (GraphicInfo info : list) {
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();

			int x = info.getX1();
			int y = info.getY1();

			if (info.getX2() < info.getX1()) {
				x = info.getX2();
				width = info.getX1() - info.getX2();
			}
			if (info.getY2() < info.getY1()) {
				y = info.getY2();
				height = info.getY1() - info.getY2();

			}

			System.out.println(info);
			System.out.println("width: " + width + ", height: " + height);
			g.drawOval(x, y, width, height);
		}

//		System.out.println("�ٽñ׷��ݴϴ�.");
////		g.drawLine(x1, y1, x2, y2);
//		int width = x2 - x1;
//		int height = y2 - y1;
//
//		int x = x1;
//		int y = y1;
//
//		// �� �� x�� ������ x���� �� �۴ٸ� �� ���� �׷����� ���������� �Ѵ�.
//		// ���������� �� ���� �� ���� ���α��̷� �Ѵ�.
//		if (x2 < x1) {
//			x = x2;
//			width = x1 - x2;
//		}
//
//		// �� �� y�� ������ y���� �� �۴ٸ� �� ���� �׷����� ���������� �Ѵ�.
//		// ���������� �� ���� �� ���� ���α��̷� �Ѵ�.
//		if (y2 < y1) {
//			y = y2;
//			height = y1 - y2;
//		}
//
//		g.drawOval(x, y, width, height);
////		g.drawRect(x, y, width, height);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// ���콺�� ������������ x,y��ǥ�� �׷����� ���������� �����մϴ�.
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	// ���콺�� ������������ x,y��ǥ�� �׷����� �������� �����մϴ�.

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();

		// ���� �ϼ��� �׷����� ������ ����Ʈ�� ��´�.
		list.add(new GraphicInfo(x1, y1, x2, y2));

		// �׷����� �ϼ��Ǿ����� �׷����� �ٽ� �׷��޶�� ��û�մϴ�.
		// "�ٽ� �׷��ּ���"��� ��û�մϴ�.
		repaint(); // paintComponent()�� �����մϴ�.
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

class Grimpan extends JFrame {

	// �׸��� �г��� �ɹ��� �����մϴ�.
	GrimpanPanel gp;

	public Grimpan() {
		gp = new GrimpanPanel();
		add(gp);
		setSize(400, 300);
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