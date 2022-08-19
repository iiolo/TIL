package exam01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

//��,�÷��̾�,�̻����� �������� �������� �θ�Ŭ������ ������
class GraphicObject{
	
	//�׸������� ������ ������ �����մϴ�.
	BufferedImage img = null;
	
	//�׸��� ����� ��ġ ������ �����մϴ�.
	int x=0, y=0;
	
	//�����ÿ� �׸����ϸ��� ���޹޾ƿ�
	public GraphicObject(String name) {
		try {		//�׸������� �о� ���̶��� ���ܰ� �߻��ϱ� ������ ����ó���� �� �ݴϴ�.
			img = ImageIO.read(new File(name));
		}catch (Exception e) {
			//���ܰ� �߻��ϸ� ���ܸ޼����� ����մϴ�.
			System.out.println("���ܹ߻�:"+e.getMessage());
			
			//���α׷��� �����ŵ�ϴ�.
			System.exit(0);
		}
	}
	
	//�׷����� ��ġ�� �����ϱ� ���� �޼ҵ带 �����մϴ�.
	//body�� ��üȭ ���� �ʾƼ� �ڽ�Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �մϴ�.
	public void update() {}
	
	//����� ��ġ�� �׷����� �׷��ֱ� ���� �޼ҵ��Դϴ�.	
	public void draw(Graphics g) {	
		g.drawImage(img, x, y, null);
	}
	
	//Ű���� �̺�Ʈ�� ó���ϱ� ���� �޼ҵ��Դϴ�.
	//body�� ��üȭ ���� �ʾƼ� �ڽ�Ŭ�������� �ڽſ��� �µ��� �������̵� �ϵ��� �մϴ�.
	public void keyPressed(KeyEvent event) {}
	
}

//GraphicObject�� Ȯ���� �̻��� Ŭ������ ������
class Missile extends GraphicObject{
	
	//�̻����� �׷����� ������ ���� ���º���
	boolean launched = false;
	
	//�����ÿ� �̻����� �׸������̸��� ���޹޾ƿ�
	public Missile(String name) {
		
		//�׸������̸��� �θ�������� �����մϴ�.
		super(name);
		
		//�̻����� y��ǥ�� -200���� �����մϴ�.
		y=-200;
	}

	//�̻����� ��ġ�� �����ϱ� ���Ͽ� �θ��� update�޼ҵ带 �������̵� �մϴ�.	
	public void update() {
		
		//���� �̻����� �߻� �Ȼ��¶��(�׷���� �ϴ� ���¶��)
		//�̻����� ���� �����ϵ��� 1��ŭ ����Ͽ� ���ҽ�ŵ�ϴ�.
		if(launched == true) {
			y=y-50;
		}
		
		//���� �̻����� ��ġ�� �����Ͽ� ȭ���� �������� ����ٸ�
		//�̻����� ȭ�鿡 �׸��ʿ䰡 �����Ƿ� launched�� false�� �����մϴ�.
		if(y < -100) {
			launched = false;
		}
	}
	
	//Ű���尡 �������� �̺�Ʈ ó���� ���� �޼ҵ带 ������
	//Ű�����̺�Ʈ�� �̻����� ����� x,y��ǥ�� �Ű������� ���޹޾�
	public void keyPressed(KeyEvent event, int x, int y) {
		
		//������Ű�� �����̽��� ���� �Ǻ��մϴ�.
		if(event.getKeyCode() == KeyEvent.VK_SPACE) {
			
			//�̻����� �߻��Ű�� ���Ͽ� launched�� true�� �����մϴ�.
			launched = true;
			
			//�̻����� �����ġ�� �����մϴ�.
			this.x = x;
			this.y = y;
			
			//�̻����� �߻� �Ǿ����� �Ҹ��� ���� �մϴ�.
			
			//�Ҹ����� ��ü�� �����մϴ�.
			File file = new File("LASER.WAV");
			
			try {
				//����� ������ �о���� ���� �غ� �մϴ�.
				Clip clip = AudioSystem.getClip();
				
				//����� ������ �о�ɴϴ�.
				clip.open(AudioSystem.getAudioInputStream(file));
				
				//����������� ����մϴ�.
				clip.start();
				
			}catch (Exception e) {
				System.out.println("���ܹ߻�:"+e.getMessage());
			}
		}
	}
	
}


//���� ���� Ŭ������ ������
class Enermy extends GraphicObject{
	
	//���� x�� �̵������� ���ؿ�
//	int dx = -10;

	//���� �̵���θ� ������ ������
	int dx;
	int dy;
	
	
	//�����ÿ� ���� �׸����ϸ��� ���޹޾ƿ�
	public Enermy(String name) {
		
		//�θ��� �����ڿ��� �׸����ϸ��� �����մϴ�.
		super(name);
		
		System.out.println("���� ������");
		
		Random r = new Random();
		
		//���� ��ġ�� �����մϴ�. ��÷�� ���� ��ġ�� ������ ���� �����մϴ�. 
		x = r.nextInt(500);
		y = r.nextInt(300);
		
		//���� �̵��ϴ� ���� ������ ������
		dx = r.nextInt() % 30;     // ���࿡ ������ 0~29  
		dy = r.nextInt() % 30;
		
		//�̵��ϴ� �Ÿ��� �ּҰ��� 10�̻����� ����� �;��
		if(dx >= 0) {
			dx += 10;   //���࿡ ������ 10~39
		}else {
			dx -= 10;	
		}
		
		if(dy >= 0) {
			dy += 10;
		}else {
			dy -= 10;
		}
		
	}
	
	//���� ��ġ�� �����Ű�� ���� update�޼ҵ带 �������̵� �մϴ�.
	public void update() {
		
		//x�����θ� �̵���Ű�� ���Ͽ� 
		//x�� �̵��Ÿ��� dx�� �����մϴ�.
		x += dx;
		
		//y������ �̵���Ű�� ���Ͽ�
		//y�� �̵��Ÿ��� dy�� �����մϴ�.
		y += dy;
		
		//x���� ������ �Ѿ��ٸ� �ݴ�������� �̵��ϵ��� �մϴ�.
		if(x < 0 || x >= 500) {
			dx = dx * -1;
		}
		
		//y���� �̵������� �Ѿ��ٸ� �ݴ�������� �̵��ϵ��� �մϴ�.
		if(y < 0 || y >= 300) {
			dy = dx * -1;
		}
		
	}
	
	//���� �̻��Ͽ� �¾����� ������� �ϴ� �޼ҵ带 ����
	//�̸޼ҵ�� ���� �ϱ� ���Ͽ� �Ű������� ������ ���޹޾ƾ� �ұ��?  ==> �̻��� ��ǥ
	//�̸޼ҵ�� ��𿡼� ȣ���ϸ� �ɱ��?
	public void crush(Missile missile) {
		//���� ����,���α��� 40�̶�� ���� 
		//�̻����� x,y��ǥ�� �� �����ȿ� �ִ��� �Ǻ��մϴ�.
		if(missile.x >= x && missile.x <= x + 40&& missile.y >= y && missile.y <= y + 40) {
			
			//y��ǥ���� ������ �־ ������� �մϴ�.
			y=-1000;
		}
	}
	
}


//�÷��̾ ���� Ŭ������ ������
class SpaceShip extends GraphicObject{
	
	//�����ÿ� �׸����ϸ��� ���޹޾ƿ�
	public SpaceShip(String name) {
		
		//�θ��� �����ڿ��� �׸����ϸ��� �����մϴ�.
		super(name);
		
		//�÷��̾��� ��ġ�� �����մϴ�.
		x = 150;
		y = 350;
	}
	
	//Ű���� �̺�Ʈó���� ���� �޼ҵ带 �����մϴ�.
	public void keyPressed(KeyEvent event) {
		
		//���ʹ���Ű�� �����ٸ� x�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ű���� �մϴ�.
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			x = x - 10;
		}
		
		//�����ʹ���Ű�� �����ٸ� x�� ���� �������� �÷��̾� ��ġ�� ���������� �̵���Ű���� �մϴ�.
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x = x + 10;
		}
		
		//���ʹ���Ű�� �����ٸ� y�� ���� ���ҽ��� �÷��̾� ��ġ�� �������� �̵���Ű���� �մϴ�.
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			y = y - 10;
		}
		
		//�Ʒ��ʹ���Ű�� �����ٸ� y�� ���� �������� �÷��̾� ��ġ�� �Ʒ������� �̵���Ű���� �մϴ�.
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			y = y + 10;
		}
		
		
	}
}


//��,�÷��̾�,�̻����� �׷����� ǥ���ϱ� ���� �г�Ŭ������ ������
//Ű�����̺�Ʈ ó�������Ͽ� KeyListener�������̽��� �����ϵ��� �մϴ�.
class MyPanel extends JPanel implements KeyListener{
	
	//������ ��������� ��, �÷��̾�, �̻��� ��ü�� �ɹ������� �����մϴ�.
	//Enermy enermy;
	//���� ������ ������
	ArrayList<Enermy> enermyList;
	SpaceShip spaceShip;
	Missile missile;
	
	//�����ڿ��� Ű�����̺�Ʈ�� ����ϰ� 
	//������ ��,�÷��̾�,�̻��� ��ü�� �����մϴ�.
	public MyPanel() {
		
		
		
		
		//Ű���� �̺�Ʈ�� ����մϴ�.
		addKeyListener(this);
		
		//�����̳� ������ �гο� Ű���� �̺�Ʈ�� ����ϱ� ���Ͽ� ������ �޼ҵ带 ȣ���մϴ�.
		requestFocus();
		setFocusable(true);
		
		//���� ���� ��ü�� �����մϴ�.
		//enermy = new Enermy("enemy.png");
		//�������� ���� ����� ���Ͽ� ����Ʈ�� �����մϴ�.
		enermyList = new ArrayList<Enermy>();
		enermyList.add(new Enermy("enemy.png"));
		enermyList.add(new Enermy("enemy.png"));
		enermyList.add(new Enermy("enemy.png"));
		enermyList.add(new Enermy("enemy.png"));
		enermyList.add(new Enermy("enemy.png"));
		
		//�÷��̾ ���� ��ü�� �����մϴ�.
		spaceShip = new SpaceShip("player.png");
		
		//�̻����� ���� ��ü�� �����մϴ�.
		missile = new Missile("misile.png");
		
		//��,�÷��̾�,�̻����� 
		//���� ���� ���ع��� �ʰ� �׷����� ǥ���ϵ��� ������Ŭ������ ������.
		//�׸��� ��Ŭ������ �ٸ��������� ���� ���� ����
		//���� �гο����� �ʿ��մϴ�. �̶��� Ŭ������ Ŭ�����ȿ� ���� �� �־�� ==> inner Ŭ����
		class MyThread extends Thread{

			//run�� �������̵� �Ͽ� �����尡 �ؾ��� ���� �� �ݴϴ�.
			public void run() {
					
				//��ӹݺ��Ͽ� ��,�÷��̾�,�̻����� ��ġ�� �����Ͽ� �ٽ� �׸����� �մϴ�.
				while(true) {
					spaceShip.update();	//�÷��̾��� ��ġ�� �����մϴ�.
					missile.update();	//�̻����� ��ġ�� �����մϴ�.
					
//					enermy.update();	//���� ��ġ�� �����մϴ�.
//
//					//���� �̻��Ͽ� �¾����� ������� �ϴ� �޼ҵ带 ȣ���մϴ�.
//					enermy.crush(missile);
					
					//�������� ���� ��� ����Ʈ�� �� ��ŭ ��ȸ�ϸ鼭 
					//������ ���� ��ġ�� �����ϰ� �¾Ҵ��� �Ǻ��ϵ��� �մϴ�.
					for(Enermy enermy :enermyList) {
						enermy.update();
						enermy.crush(missile);
					}
					
					repaint();			//����� ��ġ�� �ٽ� �׷��ݴϴ�.
					
					try {
						Thread.sleep(100);
					}catch (Exception e) {
					}
				}
			}// end run
			
		}// end Thread
		
		//������ ��ü�� �����մϴ�.
		Thread t = new MyThread();
		
		//�����带 �����մϴ�.
		t.start();
	}
	
	
	//�гο� �׷����� ǥ���ϱ� ���Ͽ� paint�޼ҵ带 �������̵� �մϴ�.
	
	public void paint(Graphics g) {
		
		//�θ��� paint�� ȣ���Ͽ� ȭ���� ������ ����ϴ�.
		super.paint(g);
		
		//���� �׷��ݴϴ�.
		//enermy.draw(g);

		//����Ʈ�� ��� ��� ���� �׷��ݴϴ�.
		for(Enermy enermy:enermyList) {
			enermy.draw(g);
		}
		
		//�÷��̾ �׸��ϴ�.
		spaceShip.draw(g);
		
		//�̻����� �׸��ϴ�.
		missile.draw(g);
		
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//Ű���尡 ������������ ������ �޼ҵ尡 �����մϴ�.
	public void keyPressed(KeyEvent e) {
		
		//Ű���尡 �������� �÷��̾��� ��ġ�� �����ϵ��� �޼ҵ带 ȣ���մϴ�.
		spaceShip.keyPressed(e);
		
		//Ű���尡 �������� �̻����� �߻��Ű�� ���Ͽ� �޼ҵ带 ȣ���մϴ�.
		//���� �÷��̾� ��ġ���� �̻����� �߻� �ǵ��� 
		//�÷��̾��� ��ġ�� ���� �����մϴ�.
		missile.keyPressed(e, spaceShip.x, spaceShip.y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


//�������� ���� Ŭ������ ������
class MyFrame extends JFrame{
	
	//�����ڿ��� �г��� �����Ͽ� ��ƿ�
	public MyFrame() {
		setTitle("My Game");
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Game {
	public static void main(String[] args) {
		new MyFrame();
	}

}
