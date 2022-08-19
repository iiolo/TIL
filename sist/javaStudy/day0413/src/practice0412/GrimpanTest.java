package practice0412;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 하나으 그래픽의 정보를 표현하기 위한 클래스
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

//그래픽을 표현하기 위하여 JPanel을 상속한 클래스를 만들어 주고 
//또, 마우스 이벤트 처리를 위하여 MouseListener를 구현합니다.
class GrimpanPanel extends JPanel implements MouseListener {

	// 그려진 그래픽의 정보를 담기 위한 리스트 생성
	ArrayList<GraphicInfo> list;

	int x1, y1, x2, y2;
	// 마우스가 눌러진 시작점, 끝점을 저장하기 위한 변수를 선언합니다.

	// 생성자에서 마우스이벤트를 등록합니다.
	public GrimpanPanel() {
		// 그려진 그래픽의 정보를 담기 위한 리스트 생성
		list = new ArrayList<GraphicInfo>();

		// 패널에 마우스 이벤트를 등록합니다.
		addMouseListener(this);
	}

	// 패널을 다시그려줄 필요가 있을때에 paintComponent가 자동으로 동작합니다.
	// paintComponent를 오버라이딩 하여 그래픽을 표현 해 줍니다.
	@Override
	protected void paintComponent(Graphics g) {
		System.out.println("다시 그려줍니다");
		System.out.println("그래픽의 수: " + list.size());

		// 리스트에 담긴 그래픽 정보만큼 그려줌
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

//		System.out.println("다시그려줍니다.");
////		g.drawLine(x1, y1, x2, y2);
//		int width = x2 - x1;
//		int height = y2 - y1;
//
//		int x = x1;
//		int y = y1;
//
//		// 끝 점 x가 시작점 x보다 더 작다면 끝 점을 그래픽의 시작점으로 한다.
//		// 시작점에서 끝 점을 뺀 값을 가로길이로 한다.
//		if (x2 < x1) {
//			x = x2;
//			width = x1 - x2;
//		}
//
//		// 끝 점 y가 시작점 y보다 더 작다면 끝 점을 그래픽의 시작점으로 한다.
//		// 시작점에서 끝 점을 뺀 값을 세로길이로 한다.
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

	// 마우스가 눌러졌을때의 x,y좌표를 그래픽을 시작점으로 저장합니다.
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	// 마우스가 떼어졌을때의 x,y좌표를 그래픽의 끝점으로 저장합니다.

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();

		// 현재 완성된 그래픽의 정보를 리스트에 담는다.
		list.add(new GraphicInfo(x1, y1, x2, y2));

		// 그래픽이 완성되었을때 그래픽을 다시 그려달라고 요청합니다.
		// "다시 그려주세요"라고 요청합니다.
		repaint(); // paintComponent()가 동작합니다.
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

	// 그림판 패널을 맴버로 선언합니다.
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