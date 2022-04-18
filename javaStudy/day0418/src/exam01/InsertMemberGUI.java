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

public class InsertMemberGUI extends JFrame implements ActionListener {
	JTextField jtf_id;
	JTextField jtf_name;
	JTextField jtf_age;
	
	public InsertMemberGUI() {
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_age = new JTextField(10);
		
		JLabel label_id = new JLabel("아이디:");
		JLabel label_name = new JLabel("이름:");
		JLabel label_age = new JLabel("나이:");
		
		JButton btn = new JButton("등록");
		
		setLayout(new FlowLayout());
		add(label_id);
		add(jtf_id);
		
		add(label_name);
		add(jtf_name);
		
		add(label_age);
		add(jtf_age);
		
		add(btn);
		
		btn.addActionListener(this);
		
		setTitle("회원등록");
		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {		
		
		String id = jtf_id.getText();
		String name = jtf_name.getText();
		int age =  Integer.parseInt(jtf_age.getText());
		
		String sql = "insert into member values('"+id+"','"+name+"',"+age+")";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			int re =stmt.executeUpdate(sql);
			if(re == 1) {
				JOptionPane.showMessageDialog(this,"회원등록에 성공하였습니다.");
			}else {
				JOptionPane.showMessageDialog(this,"회원등록에 실패하였습니다.");
			}
			stmt.close();
			conn.close();
			
		}catch (Exception ex) {
			System.out.println("예외발생:"+ ex.getMessage());
		}
		
		
		
	}

	public static void main(String[] args) {
		new InsertMemberGUI();

	}

}
