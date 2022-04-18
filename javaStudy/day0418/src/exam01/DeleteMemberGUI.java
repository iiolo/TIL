package exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteMemberGUI extends JFrame implements ActionListener {
	JTextField jtf;
	
	public DeleteMemberGUI() {
		//â ������ ����
		setTitle("ȸ������");
		
		//ȭ���� ���̾ƿ��� ������� ��ġ�ϴ� ����� ����
		setLayout(new FlowLayout());
		
		//�ؽ�Ʈ�ʵ带 ����
		jtf = new JTextField(10);
		
		//���� ����
		JLabel label = new JLabel("������ ȸ���� ���̵�:");
		
		//��ư�� ����
		JButton btn = new JButton("����");
		
		//��ư�� �̺�Ʈ�� ����մϴ�.
		btn.addActionListener(this);
		
		//���� �����ӿ� ��ƿ�
		add(label);
		
		//�ؽ�Ʈ�ʵ带 �����ӿ� ��ƿ�
		add(jtf);
		
		//��ư�� �����ӿ� ��ƿ�
		add(btn);
				
		//������ũ�⸦ ����
		setSize(450, 300);
		
		//�������� ���̵��� ����
		setVisible(true);
		
		//�ݱ� ��ư�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ȸ���� ���̵� ������ �����մϴ�.
		String id = jtf.getText();
		
		//������ �����ͺ��̽� ��ɾ ������
		String sql =  "delete member where id = '"+id+"'";
		
		try {
			//jdbc����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. db������ �����Ѵ�.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			
			// 3. �����ͺ��̽� ����� �����ϱ� ���� ��ü�� �����մϴ�.
			Statement stmt = conn.createStatement();
			
			// 4. �����ͺ��̽� ��ɾ ������ ��� ���� re�� ����
			int re =stmt.executeUpdate(sql);
			
			//5. ���������� ����� ������ ���ڵ��� ���� ��ȯ
			if(re == 1) {
				JOptionPane.showMessageDialog(this, "ȸ���� ������ �����Ͽ����ϴ�.");
			}else {
				JOptionPane.showMessageDialog(this, "ȸ���� ���������� �����Ͽ����ϴ�.");
			}
			
			// 6. ����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			stmt.close();
			conn.close();
		}catch (Exception ex) {
			System.out.println("���ܹ߻�:"+ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� �����ϱ�
		new DeleteMemberGUI();
	}
}
