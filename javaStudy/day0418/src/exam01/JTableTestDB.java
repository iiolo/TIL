package exam01;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

//�����ͺ��̽� �����Ͽ� ��� ���� ������ 
//�������̺� ��� �� ���ϴ�.
//�ϼ��ϸ� "3"

public class JTableTestDB extends JFrame implements ActionListener {

	JTable table;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
		
	public JTableTestDB() {
		colNames = new Vector<String>();
		colNames.add("���̵�");
		colNames.add("�̸�");
		colNames.add("����");		
	
		rowData = new Vector<Vector<String>>();			
			
		//���̸��� �ִ� ���Ϳ� ��ü�����Ͱ� ��� ���͸� ���� �������̺��� ������
		table = new JTable(rowData, colNames);
		
		//�������̺��� ��ũ�������� ���ο�
		JScrollPane jsp = new JScrollPane(table);
		
		//�������̺��� ���ΰ� �ִ� ��ũ������ ������ ��ƿ�
		add(jsp, BorderLayout.CENTER);
		
		JButton btn = new JButton("ȸ�� ��� �о����");
		add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String sql = "select * from member";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.98:1521:XE",
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			
			//�˻��� �����ŭ �ݺ� �����մϴ�.
			while(rs.next()) {
				
				//���̵� �̾ƿɴϴ�.
				String id = rs.getString(1);
				
				//�̸��� �̾ƿɴϴ�.
				String name = rs.getString(2);
				
				//���̸� �̾ƿɴϴ�.
				int age = rs.getInt(3);
				
				//�ϳ��� ���� ǥ���ϱ� ���� ���͸� �����մϴ�.
				Vector<String> row = new Vector<String>();
				
				//���Ϳ� ���̵�,�̸�,���̸� ��ƿ�
				row.add(id);
				row.add(name);
				row.add(age+"");
				
				//�ϳ��� ���� ��� ���͸� ��ü�����͸� ������� ���Ϳ� ��ƿ�
				rowData.add(row);
				
				//�������̺��� �ٽ� �׷��� ���� ��û�մϴ�.
				table.updateUI();
			}
			
			//����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception ex) {
			System.out.println("���ܹ߻�:"+ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new JTableTestDB();

	}

}
