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

// 미사일, 적, 플레이어 공통 클래스
class GraphicObject {
	// 그림파일 참조할 변수 선언
	BufferedImage img = null;

	// 그림을 출력할 위치 변수 선언
	int x = 0, y = 0;

	// 생성시에 그림파일 명을 전달받음
	public GraphicObject(String name) {

		try {// 그림파일을 읽어들일 때 예외가 발생하기 때문에 예외처리
			img = ImageIO.read(new File(name));

		} catch (Exception e) {
			// 예외 발생 시 예외 메세지 출력
			System.out.println("예외발생" + e.getMessage());

			// 프로그램 종료
			System.exit(0);
		}
	}

	// 그래픽의 위치를 변경하기 위한 메소드 정의
	// body를 구체화하지 않아서 자식 클래스들이 자신에게 맞도록 오버라이딩 하도록 한다
	public void update() {

	}

	// 변경된 위치에 그래픽을 그려주기 위한 메소드
	// body를 구체화하지 않아서 자식 클래스들이 자신에게 맞도록 오버라이딩 하도록 한다
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	// 키보드 이벤트를 처리하기 위한 메소드
	// body를 구체화하지 않아서 자식 클래스들이 자신에게 맞도록 오버라이딩 하도록 한다
	public void keyPressed(KeyEvent event) {

	}

}

// GraphicObject를 확장한 미사일 클래스
class Missile extends GraphicObject {
	// 미사일을 그려줄 지 말지를 위한 상태 변수
	boolean launched = false;

	// 생성 시에 미사일의 그림 파일 이름 전달 받음
	public Missile(String name) {
		// 그림파일 이름을 부모 생성자에게 전달
		super(name);

		// 미사일의 y 좌표를 -200으로 설정하여 화면에서 안보이도록 한다.
		y = -200;
	}

	// 미사일의 위치를 변경하기 위하여 부모의 update 메소드 오버라이딩
	@Override
	public void update() {
		// 현재 미사일이 발사 된 상태라면(그려줘야 하는 상태라면)
		// 미사일이 위로 진행하도록 1만큼 계속하여 감소시킴
		if (launched == true) {
			y -= 50;
		}

		// 만약 미사일이 위치가 감소하여 화면의 영역에서 벗어났다면
		// 미사일을 화면에 그릴 필요가 없으므로 launched에 false 저장
		if (y < -100) {
			launched = false;
		}

	}

	// 키보드가 눌러지는 이벤트 처리를 위한 메소드
	// 키보드 이벤트와 미사일의 출발점 x,y 좌표를 매개변수로 전달받음
	public void keyPressed(KeyEvent event, int x, int y) {

		// 눌러진 키가 스페이스 바인지 판별
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {

			// 미사일을 발사시키기 위하여 launched 에 true 설정
			launched = true;

			// 미사일의 출발 위치 설정
			this.x = x;
			this.y = y;
		}
	}

}

// 적을 위한 클래스
class Enermy extends GraphicObject {
	// 적의 x축 이동간격
	int dx = -10;

	// 생성시에 적의 그림파일명 전달받음
	public Enermy(String name) {
		// 부모의 생성자에게 그림파일명 전달
		super(name);

		// 적의 위치 설정
		x = 200;
		y = 0;
	}

	// 적의 위치를 변경시키기 위한 update 메소드 오버라이딩
	@Override
	public void update() {
		// x축으로만 이동시키기 위해 x에 이동거리인 dx 누적
		x += dx;

		// 만약 이동방향이 음수인데 x위치가 0보다 작아지면 이동방향을 양수로 만듦
		if (x < 0) {
			dx = +10;
		}

		// 만약 이동방향이 양수인데 x위치가 500보다 커지면 이동방향을 음수로 만듦

		if (x > 500) {
			dx = -10;
		}
	}

}

// 플레이어를 위한 클래스
class SpaceShip extends GraphicObject {

	// 생성 시에 그림파일명 전달받음
	public SpaceShip(String name) {
		// 부모의 생성자에게 그림파일명 전달
		super(name);

		// 플레이어의 위치 설정
		x = 150;
		y = 300;

	}

	// 키보드 이벤트 처리를 위한 메소드 정의

	@Override
	public void keyPressed(KeyEvent event) {
		// 왼쪽 방향 키를 눌렀다면 x의 값을 감소시켜 플레이어 위치를 왼쪽으로 이동시킴
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		// 오른쪽 방향 키를 눌렀다면 x의 값을 증가시켜 플레이어 위치를 오른쪽으로 이동시킴
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		// 위쪽 방향 키를 눌렀다면 y의 값을 감소시켜 플레이어 위치를 위쪽으로 이동시킴
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		// 아래쪽 방향 키를 눌렀다면 y의 값을 증가시켜 플레이어 위치를 위쪽으로 이동시킴
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}

}

// 적, 플레이어, 미사일을 그래픽으로 표현하기 위한 패널 클래스 만들기
// 키보드 이벤트 처리를 위하여 KeyLister 인터페이스 구현
class MyPanel extends JPanel implements KeyListener {
	// 게임의 구성요소인 적, 플레이어, 미사일 객체를 멤버 변수로 선언
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;

	public MyPanel() {
		// 키보트 이벤트 등록
		addKeyListener(this);

		// 컨테이너 역할인 패널에 키보드 이벤트를 등록하기 위해 다음의 메소드 호출
		requestFocus();
		setFocusable(true);

		// 적을 위한 객체 생성
		enermy = new Enermy("enemy.png");

		// 플레이어를 위한 객체 생성
		spaceship = new SpaceShip("player.png");

		// 미사일을 위한 객체 생성
		missile = new Missile("misile.png");

		// 적. 플레이어, 미사일이 각자 서로 방해받지 않고 그래픽을 표현하도록 thread class 생성
		// 이 클래스는 다른 곳에 사용될 일 없고 여기 패널에서만 필요, 이 때 클래스를 클래스 안에 생성 가능 : inner class
		class MyThread extends Thread {
			// run을 오버라이딩 하여 쓰레드가 해야 할 일을 써 준다.
			public void run() {
				// 계속 반복하여 적, 플레이어, 미사일의 위치를 변경하여 다시 그린다.
				while (true) {
					enermy.update();// 적 위치 변경
					spaceship.update();// 플레이어 위치 변경
					missile.update();// 미사일 위치 변경
					repaint(); // 변경된 위치에 다시 그려줌
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				

			}
			// end run
		}// end thread
			// 쓰레드 객체 생성
		Thread t = new MyThread();

		// 쓰레드 가동
		t.start();
	}

// 패널에 그래픽을 표현하기 위해 paint 메소드 오버라이딩
	@Override
	public void paint(Graphics g) {
		// 부모의 paint를 호출하여 화면을 깨끗이 지운다.
		super.paint(g);

		// 적 그리기
		enermy.draw(g);

		// 플레이어 그리기
		spaceship.draw(g);

		// 미사일 그리기
		missile.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// 키보드가 눌러졌을 때 다음의 메소드 동작
	@Override
	public void keyPressed(KeyEvent e) {
		// 키보드가 눌러지면 플레이어의 위치를 변경하도록 메소드 호출
		spaceship.keyPressed(e);

		// 키보드가 눌러지면 미사일을 발사시키기 위해 메소드 호출
		// 현재 플레이어의 위치에서 미사일이 발사되도록 플레이어의 위치도 같이 전달
		missile.keyPressed(e, spaceship.x, spaceship.y);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

//프레임을 위한 클래스 만들기
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
