package exam01;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class ListMemberGUI extends JFrame implements ActionListener {

	JTextArea jta;
	
	public ListMemberGUI() {
		jta = new JTextArea(10, 80);
		JScrollPane jsp = new JScrollPane(jta);
		JButton btn = new JButton("회원 목록 출력");
		add(jsp, BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String sql = "select * from member";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String row = id + "\t"+ name+"\t"+age;
				jta.append(row+"\n");				
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}

	}

	public static void main(String[] args) {
		new ListMemberGUI();

	}

}
