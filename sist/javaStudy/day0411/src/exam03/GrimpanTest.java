package exam03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel implements MouseListener{

	int x1, y1, x2, y2;
	
	
	// 생성자에서 마우스 이벤트 등록
	public GrimpanPanel() {
		// 패널에 마우스 이벤트 등록
		 addMouseListener(this);
		
	}
	
	// 패널을 다시 그려줄 필요가 있을 때에 paintComponent가 자동 동작
	// paintComponent를 오버라이딩 하여 그래픽 표현
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("다시 그려줍니다. ");
		g.drawLine(x1, y1, x2, y2);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	// 마우스가 눌러졌을 때의 x,y 좌표를 그래픽의 시작점으로 저장
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		
		
		
	}

	// 마우스가 떼어졌을 때의 x,y 좌표를 그래픽의 끝점으로 저장
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		// 다시 그려주세요 라고 요청
		repaint();// paintComponent 동작
		
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
