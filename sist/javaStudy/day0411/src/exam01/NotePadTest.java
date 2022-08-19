package exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// NotePad �ڽ��� �޴��� ���� �̺�Ʈ ó�� Ŭ������ �ǵ��� �Ѵ�.
class NotePad extends JFrame implements ActionListener{
	
	// �޸����� ���ڸ� �Է��ϴ� �κ��� ���� �ؽ�Ʈ����� ��������� ����
	JTextArea jta;
	
	public NotePad() {
		//�ؽ�Ʈ������ ����
		jta = new JTextArea(10,80);// �� ��, ĭ �� 
		
		// �ؽ�Ʈ ����� ��ũ���� �����ϱ� ���� ��ũ�� �� ����
		JScrollPane jsp = new JScrollPane(jta);
		
		//�����ӿ� ��ũ���� ���
		add(jsp);
		
		
		// �޴��� ����
		JMenuBar jmb = new JMenuBar();
		
		
		//�ָ޴� ���� ����
		JMenu mn_file = new JMenu("����");
		
		// ���Ͽ� ���� �θ޴� ������,����,�����ϱ� ����
		JMenuItem file_new = new JMenuItem("�� ����");
		JMenuItem file_open = new JMenuItem("����");
		JMenuItem file_save = new JMenuItem("����");
		
		
		
		// �θ޴� ������, ����, �����ϱ⸦ �� �޴� ���Ͽ� ���
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		// ������ �θ޴��鿡 ���� �̺�Ʈ ���
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		
		// �޴� �ٿ� �� �޴� ���� ���
		jmb.add(mn_file);
		
		// �޴��ٸ� �����ӿ� ����
		setJMenuBar(jmb);
		
		
		
		// â�� ũ�� ����
		setSize(400,300);
		
		// â�� ȭ�鿡 �����ֵ��� ����
		setVisible(true);
		
		// â�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	// �޴��� �������� �� �� �޼ҵ� ����
	// � �޴��� ������������ ������ �Ű������� ActionEvent e�� ���޹޴´�.
	@Override
	public void actionPerformed(ActionEvent e) {
		 // ������ �޴��� ���ڸ� ������ ����
		String cmd = e.getActionCommand();
		if (cmd.equals("�� ����")) {
			jta.setText("");
		} else if(cmd.equals("����")) {
			// hello.txt ������ ������ �о�鿩 �ؽ�Ʈ����� ����Ѵ�.
			String str ="";
			// ���� ������� ���� �����ڿ� �޼ҵ���� ���ܸ� �Ȱ� �־� ����ó��
			try {
				// ���� ������ �����Է��� ���� ��ü ����
				FileReader fr = new FileReader("c:/temp/hello.txt");
				// �ѱ��ھ� �о�� ���� ����
				int ch;
				
				while (true) {
					// ���Ϸκ��� �� ���ھ� �о����
					ch = fr.read();
					
					// ������ ���� �����ϸ� �ݺ��� Ż��
					if (ch == -1) {
						break;
					}
					
					// ���Ϸ� �о� �о���� ������ �������� ���ڷ� ��ȯ
					char data = (char)ch;
					
					//�ѱ��ھ� �о�� ���ڸ� str�� ����
					str = str + data;
				}
				// ���Ϸ� ��� �о�� ���ڿ��� ������ str�� ������ �ؽ�Ʈ ����� ���
				jta.setText(str);
				
				// ����� ���� ���� �ݱ�
				 fr.close();
				
			} catch (Exception ex) {
				// TODO: handle exception
			}
			
		} else if (cmd.equals("����")) {
			// ���� �ؽ�Ʈ �������� ������ ���Ϸ� ���
			
			// ���� ������ ���Ϸ� ����ϱ� ���� FileWriter ��ü ����
			try {
				FileWriter fr = new FileWriter("c:/temp/hello.txt");
				
				// ������ ������ �о�ͼ� ��� ������ ���ڿ� ���� ����
				
				
				// �ؽ�Ʈ�������� ������ ��� ���Ϸ� ���
				fr.write(jta.getText());
				
				// ������ ����� �������� ���� �ݱ�
				fr.close();
				
				System.out.println("������ �����Ͽ����ϴ�.");
			} catch (Exception ex) {
				System.out.println("���ܹ߻�: "+ex.getMessage());
			}
			
		}
	}
	
	
}
public class NotePadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NotePad  ��ü ����
		new NotePad();
	}

}
