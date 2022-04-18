package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer2 extends JFrame {
	
	//�̹����� ǥ���ϱ� ���� ���� �ɹ������� �����մϴ�.
	JLabel label;
	
	//�󺧿� �̹����� ǥ���ϱ� ���Ͽ� �̹����������� �ʿ��մϴ�.
	ImageIcon icon;
	
	public FileServer2() {
		
		//�̹��������� ��ü�� �����մϴ�.
		icon = new ImageIcon("flower.png");
		
		//�̹��������� ��ü�� ���� ���� �����մϴ�.
		label = new JLabel(icon);
		
		//���� �������� ����� ��ƿ�
		add(label, BorderLayout.CENTER);
		
		JButton btn = new JButton("�̹����ٲٱ�");
		add(btn, BorderLayout.SOUTH);
		
		//�̸����� innerŬ����(�͸�Ŭ����)�� ���ؼ� �̺�Ʈó���� �� ���ô�.
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�̹����������� �ٽ� ������
				icon = new ImageIcon("enemy.png");
				
				//�ٽø������ �̹����������� �󺧿� �����մϴ�.
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
