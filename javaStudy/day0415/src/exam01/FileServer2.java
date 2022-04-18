package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer2 extends JFrame {
	
	//이미지를 표현하기 위한 라벨을 맴버변수로 선언합니다.
	JLabel label;
	
	//라벨에 이미지를 표현하기 위하여 이미지아이콘이 필요합니다.
	ImageIcon icon;
	
	public FileServer2() {
		
		//이미지아이콘 객체를 생성합니다.
		icon = new ImageIcon("flower.png");
		
		//이미지아이콘 객체를 갖고 라벨을 생성합니다.
		label = new JLabel(icon);
		
		//라벨을 프레임의 가운데에 담아요
		add(label, BorderLayout.CENTER);
		
		JButton btn = new JButton("이미지바꾸기");
		add(btn, BorderLayout.SOUTH);
		
		//이름없는 inner클래스(익명클래스)를 통해서 이벤트처리를 해 봅시다.
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//이미지아이콘을 다시 만들어요
				icon = new ImageIcon("enemy.png");
				
				//다시만들어진 이미지아이콘을 라벨에 설정합니다.
				label.setIcon(icon);
				
				
			}
		}  );
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FileServer2();
	}

}
