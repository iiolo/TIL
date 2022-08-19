package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FileCient extends JFrame implements ActionListener {

	JTextField jtf;
	JFileChooser jfc;
	
	//������ ������ ��� ���� ����
	File file;
	
	//�����͸� �����ϱ� ���� ��Ʈ���� �ɹ������� �����մϴ�.
	OutputStream os;
	
	public FileCient() {
		jfc = new JFileChooser("c:/temp");
		jtf = new JTextField(30);
		JButton btnFile = new JButton("���ϼ���");
		JButton btnSend = new JButton("��������");
		btnFile.addActionListener(this);
		btnSend.addActionListener(this);
		setLayout(new FlowLayout());
		add(jtf);
		add(btnFile);
		add(btnSend);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			
			//�������� ����� ��û�մϴ�.
			Socket socket = new Socket("211.238.142.98", 9005);
			
			//������ ������ ���� ��Ʈ���� �����մϴ�.
			os = socket.getOutputStream();
			
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("���ϼ���")) {
			int re = jfc.showOpenDialog(this);
			if(re == JFileChooser.APPROVE_OPTION) {
				
				//�����ϱ� ���Ͽ� ������ ������ �ɹ����� file�� ��ƵӴϴ�.
				file = jfc.getSelectedFile();
				
				//������ �����̸��� �ؽ�Ʈ�ʵ忡 ����մϴ�.
				jtf.setText(file.getName());
			}
		}else if(cmd.equals("��������")) {
			try {
				//������ ������ �޸𸮷� �о��� ���� FileInputStream��ü�� �����մϴ�.
				FileInputStream fis = new FileInputStream(file);
				
				//������ ������ �о���̱� ���� �迭�� ������
				byte []data = new byte[200];
				
				//������ ���� �ƴҶ����� �о���Դϴ�.
				while(  fis.read(data) != -1  ) {
					
					//�о���� ������ ��Ʈ���� ���� ������ �����ϴ�.
					os.write(data);
					
					//���������͸� ���Ͽ� �迭�� ����ݴϴ�.
					Arrays.fill(data, (byte)0);
				}
				
				//�����Ⱑ ���� ������ �ݾ��ݴϴ�.
				fis.close();
				
				JOptionPane.showMessageDialog(this, "������ �����Ͽ����ϴ�.");
				
				
			}catch (Exception ex) {
				System.out.println("���ܹ߻�:"+ ex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new FileCient();
	}

}
