package exam02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// NotePad �ڽ��� �޴��� ���� �̺�Ʈ ó�� Ŭ������ �ǵ��� �Ѵ�.
class NotePad extends JFrame implements ActionListener{
	
	
	// ������ ���ϸ�� �о�� ���� ���� ������ �� �ִ� ���ϼ��� ���̾�α׸� ����� ����
	JFileChooser jfc;
	
	
	// �޸����� ���ڸ� �Է��ϴ� �κ��� ���� �ؽ�Ʈ����� ��������� ����
	JTextArea jta;
	
	public NotePad() {
		
		// ���� ���� ���̾�α� ����
		jfc = new JFileChooser("c:/temp");
		
		
		//�ؽ�Ʈ������ ����
		jta = new JTextArea(10,80);// �� ��, ĭ �� 
		
		// �ؽ�Ʈ ����� ��ũ���� �����ϱ� ���� ��ũ�� �� ����
		JScrollPane jsp = new JScrollPane(jta);
		
		//�����ӿ� ��ũ���� ���
		// �����ӿ� ���̾ƿ��� �������� ������ �⺻�� BorderLayout�̴�.
		// �������ϰ�� �������� ������ ����� �����
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
		// �̺�Ʈ ó�� ����ڴ� NotePad ��ü �ڽ��� ó���ϵ��� ��
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
			
			
			String str ="";
			// ���� ������� ���� �����ڿ� �޼ҵ���� ���ܸ� �Ȱ� �־� ����ó��
			try {
				// ������� �о���� ���̾�α� ���
				int re = jfc.showOpenDialog(this);
				
				if (re == 0) {
					
					// ���̾�α׿��� ������ ���� �о����
					File file = jfc.getSelectedFile();
					
					// hello.txt ������ ������ �о�鿩 �ؽ�Ʈ����� ����Ѵ�.
					
					// ���� ������ �����Է��� ���� ��ü ����
					FileReader fr = new FileReader(file);
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
				}
				
				
			} catch (Exception ex) {
				// TODO: handle exception
			}
			
		} else if (cmd.equals("����")) {
			// ���� �ؽ�Ʈ �������� ������ ���Ϸ� ���
			
			try {
				
				// ��������� � �̸����� ������ ������ ����� ���� ���̾�α�
				int re = jfc.showSaveDialog(this);

				// ������ ���: 0, ������ ���:1
				// ������ ��� ���� �� ���Ϸ� ����
				if (re == 0) {
					// ���̾�α׿��� ������ ���� ��ü�� �о����
					File file = jfc.getSelectedFile();
					
					
					// ���� ������ ���Ϸ� ����ϱ� ���� FileWriter ��ü ����
					FileWriter fr = new FileWriter(file);
					
					// ������ ������ �о�ͼ� ��� ������ ���ڿ� ���� ����
					
					
					// �ؽ�Ʈ�������� ������ ��� ���Ϸ� ���
					fr.write(jta.getText());
					
					// ������ ����� �������� ���� �ݱ�
					fr.close();
					
					System.out.println("������ �����Ͽ����ϴ�.");
				}
				
				
				
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
