package exam03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements ActionListener {
	
	//��ȭ������ �Է��� �ؽ�Ʈ�ʵ带 �ɹ������� �����մϴ�.
	JTextField jtf;
	
	//������ �޾Ƹ��� ��ȭ������ ����Ͽ� �����Ͽ� �����ֱ� ���� �ؽ�Ʈ����� �ɹ������� �����մϴ�.
	JTextArea jta;
	
	//������ �ɹ������� ������
	Socket socket;
	
	//�����͸� �ְ� ���� ��Ʈ���� �ɹ������� �����ؿ�
	InputStream is;
	OutputStream os;
	
	public ChatClientGUI() {
		
		try {
			//����������� ��û�մϴ�.
			socket = new Socket("211.238.142.98", 9001);
			
			//�����͸� �ְ� ���� ��Ʈ���� �����մϴ�.
			is = socket.getInputStream();
			os = socket.getOutputStream();
						
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
		//�ɹ��������� �����մϴ�.
		jtf = new JTextField(40);		
		jta = new JTextArea(80, 50);
		
		//�ؽ�Ʈ����� ��ũ�ѹٸ� ���Ͽ� ��ũ�������� ���ο�
		JScrollPane jsp = new JScrollPane(jta);
		
		//"����"�� ���� ��ư�� ������
		JButton btnSend = new JButton("����");
		
		//��ư�� �̺�Ʈ�� ����մϴ�.
		btnSend.addActionListener(this);
		
		//�ؽ�Ʈ�ʵ�� ��Ʈ�� ��� �г��� ������
		JPanel p= new JPanel();
		
		//�гο� �ؽ�Ʈ�ʵ带 ��ƿ�
		p.add(jtf);
		
		//�гο� ��ư�� ��ƿ�
		p.add(btnSend);
		
		//�������� ����� �ؽ�Ʈ����� ���ΰ� �ִ� ��ũ������ ��ƿ�
		add(jsp, BorderLayout.CENTER);
		
		//�������� �Ʒ��ʿ� �ؽ�Ʈ�ʵ�� ��ư�� ��� �г��� ��ƿ�
		add(p, BorderLayout.SOUTH);
		
		//�������� ũ�⸦ ���� �ݴϴ�.
		setSize(600, 400);
		
		//�������� ȭ�鿡 �����ֵ��� �����մϴ�.
		setVisible(true);
		
		// 'X'���߸� ������ ���α׷��� �����ϵ��� �����մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//������ ���� ���ŵǴ� �����͸� ����Ͽ� �ޱ� ���� Ŭ������ 
		//������� �����մϴ�.
		class ClientThread extends Thread{
			public void run() {
				
				//������ ���� ���ŵǴ� �����͸� �ޱ� ���� �迭�� ������.
				byte []data = new byte[100];
				
				//��ӽ����մϴ�.
				while(true){
					try {					
						//��ǲ��Ʈ���� ���� ������ ���� ���ŵǴ� �����͸� �޾ƿ�
						is.read(data);
						
						//���ŵ� �����͸� ���ڿ��� ������
						String reMsg = new String(data);
						
						//���ڿ��� ��ȭ������ ������ �ؽ�Ʈ����� �߰��մϴ�.
						jta.append(reMsg + "\n"); 						
					
					}catch (Exception e) {
						System.out.println("���ܹ߻�:"+e.getMessage());
					}
				}//end while
			}//end run
		}// end Thread
		
		//������ ���� ���ŵǴ� �����͸� ����Ͽ� �޴� Ŭ���̾�Ʈ������ ��ü�� �����մϴ�.
		Thread t = new ClientThread();
		
		//�����带 �����մϴ�.
		t.start();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�ؽ�Ʈ�ʵ忡 ������ ���ڸ� ���� �ɴϴ�.
		String msg = jtf.getText();
		
		try {
			
			//��½�ƮƮ���� ���� �����͸� ������ �����ϴ�.
			//�����͸� �������� ���ڿ��� ����Ʈ�� �迭�� ��ȯ�Ͽ� �����ϴ�.
			os.write(msg.getBytes());
			
			//������ �Է��� ���ڿ��� q!�̸� ���α׷��� �����մϴ�.
			if(msg.equals("q!")) {
				System.exit(0);
			}		
			
			//���� ������ �Է��� ���Ͽ� �ؽ�Ʈ�ʵ带 ����ݴϴ�.
			jtf.setText("");
			
		}catch (Exception ex) {
			System.out.println("���ܹ߻�:"+ex.getMessage());
		}
		
		
	}

	public static void main(String[] args) {
		//�������� �����մϴ�.
		new ChatClientGUI();
	}

}