package exam01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileServer extends JFrame {
	
	//�ΰ��� �迭�� �Ű������� ���޹޾� �ϳ��� ���ļ� ���ο� �迭�� ��ȯ�ϴ� �޼ҵ带 ����
	public static byte[] addArray(byte []a, byte []b) {
		byte []r = new byte[a.length + b.length];
		
		//a�迭�� ��Ҹ� r�� �־� �ݴϴ�.
		//a�迭�� �ε����� ������ĥ �迭�� �ε����� �޶�� �մϴ�.
		//���� ��ĥ �迭�� �ε����� �����մϴ�
		int k = 0;
		for(int i=0; i<a.length; i++) {
			r[k++] = a[i];
		}
		
		//b�迭�� ��� ��Ҹ� r�� ��� �ݴϴ�.
		for(int i=0; i<b.length; i++) {
			r[k++]=b[i];
		}
		return r;
	}
	
	
	
	//����� ���Ͽ� ���������� �ɹ������� �����մϴ�.
	ServerSocket server;
	
	//�̹����� ǥ���ϱ� ���� ���� �ɹ������� �����մϴ�.
	JLabel label;
	
	//�󺧿� �̹����� ǥ���ϱ� ���Ͽ� �̹����������� �ʿ��մϴ�.
	ImageIcon icon;
	
	public FileServer() {
		
		//�̹��������� ��ü�� �����մϴ�.
		icon = new ImageIcon("flower.png");
		
		//�̹��������� ��ü�� ���� ���� �����մϴ�.
		label = new JLabel(icon);
		
		//���� �����ӿ� ��ƿ�
		add(label);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
		
			//�������ϸ� �����մϴ�.
			server = new ServerSocket(9005);
			
			//Ŭ���̾�Ʈ�� ������ ���Ѵ����·� ��ٸ��ϴ�.
			while(true) {
				
				//Ŭ���̾�Ʈ�� ��û�� �����մϴ�.
				Socket socket= server.accept();
				
				//Ŭ���̾�Ʈ �������� �����͸� �ޱ� ���� ��Ʈ���� �����մϴ�.
				InputStream is = socket.getInputStream();
				
				//�����͸� �ѹ��� �ޱ� ���� �迭�� �����մϴ�.
				byte []data= new byte[200];
				
				//��ü �����͸� �����ϱ� �迭�� �����մϴ�.
				byte []all_data = null;
				
				//Ŭ���̾�Ʈ�� �������� �����͸� ��� �޵��� �մϴ�.
				//������ ���� �ƴҶ����� �о���Դϴ�.
				//��ù��° �о�
				while( true ) {
					
					//Ŭ���̾�Ʈ�� ���� �����͸� �����մϴ�.
					//n���� ������ ����Ʈ���� ����˴ϴ�.
					int n = is.read(data);
					
					//�޼����� ����غ��ϴ�.
					System.out.println(n+"bytes�� �о�鿴���ϴ�.");
					
					//������ ���� �����ϸ� �����մϴ�. 
					//���⿡ ���� �ʾƿ�,, �ָ��� �ذ��ؼ� �ٽ� �̾߱� �մϴ�.
					if(n == -1) {
						System.out.println("������ ���� �����Ͽ����ϴ�.");
						break;
					}
					
					
					//��ù��° �о� �鿴�ٸ� all_data�� ��ƿ�
					if(all_data == null) {
						all_data = data;
					}else { //�ι�° ���Ŀ� �о���϶� ���ʹ� �����մϴ�.
						all_data = addArray(all_data, data);
					}
					
					System.out.println("������ �迭�� ����:"+all_data.length);					
					
				} //end while_2
				
				//������ �� �о�����
				//�󺧿� �׸��� ǥ�� �� �ݴϴ�.
				//�о� ���� ������ ������ all_data�� �־��!
//				icon = new ImageIcon(all_data);
				
				System.out.println("���ʿ� �ִ� while�� Ż���Ͽ����ϴ�.");
				
				//��ü�о� ���� �����͸� ���Ϸ� ����մϴ�.
				FileOutputStream fos = new FileOutputStream("r.png");
				fos.write(all_data);
				fos.close();
				System.out.println("������ �����޾ҽ��ϴ�.");
				
				icon = new ImageIcon("r.png");
				
				//�󺧿� �������� �ٽ� �����մϴ�.
				label.setIcon(icon);
				
			}//end while_1
		
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		new FileServer();
	}

}
