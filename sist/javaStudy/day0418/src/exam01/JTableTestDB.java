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

//데이터베이스 연동하여 모든 고객의 정보를 
//제이테이블에 출력 해 봅니다.
//완성하면 "3"

public class JTableTestDB extends JFrame implements ActionListener {

	JTable table;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
		
	public JTableTestDB() {
		colNames = new Vector<String>();
		colNames.add("아이디");
		colNames.add("이름");
		colNames.add("나이");		
	
		rowData = new Vector<Vector<String>>();			
			
		//행이름이 있는 벡터와 전체데이터가 담긴 벡터를 갖고 제이테이블을 만들어요
		table = new JTable(rowData, colNames);
		
		//제이테이블을 스크롤팬으로 감싸요
		JScrollPane jsp = new JScrollPane(table);
		
		//제이테이블을 감싸고 있는 스크롤팬을 프레임 담아요
		add(jsp, BorderLayout.CENTER);
		
		JButton btn = new JButton("회원 목록 읽어오기");
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
			
			//검색한 결과만큼 반복 실행합니다.
			while(rs.next()) {
				
				//아이디를 뽑아옵니다.
				String id = rs.getString(1);
				
				//이름을 뽑아옵니다.
				String name = rs.getString(2);
				
				//나이를 뽑아옵니다.
				int age = rs.getInt(3);
				
				//하나의 행을 표현하기 위한 벡터를 생성합니다.
				Vector<String> row = new Vector<String>();
				
				//벡터에 아이디,이름,나이를 담아요
				row.add(id);
				row.add(name);
				row.add(age+"");
				
				//하나의 행이 담긴 벡터를 전체데이터를 담기위한 벡터에 담아요
				rowData.add(row);
				
				//제이테이블을 다시 그려줄 것을 요청합니다.
				table.updateUI();
			}
			
			//사용했던 자원을 닫아 줍니다.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new JTableTestDB();

	}

}
