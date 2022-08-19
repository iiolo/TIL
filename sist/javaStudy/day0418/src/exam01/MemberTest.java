package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MemberTest extends JFrame implements ActionListener, MouseListener {

	JTable table;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	
	//아이디,이름,나이 입력을 위한 텍스트필드를 맴버변수로 선언합니다.
	JTextField jtf_id;
	JTextField jtf_name;
	JTextField jtf_age;
		
	public MemberTest() {
		
		//텍스트필드들을 생성합니다.
		jtf_id = new JTextField(10);
		jtf_name = new JTextField(10);
		jtf_age = new JTextField(10);
		
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
		
		//JButton btn = new JButton("회원 목록 읽어오기");
		//add(btn, BorderLayout.SOUTH);
		
		//btn.addActionListener(this);
		
		//텍스트필드와 라벨담을 패널을 만들어요
		JPanel p_input = new JPanel();
		
		//패널의 레이아웃을 3행 2열의 그리드레이아웃으로 설정합니다.
		p_input.setLayout(new GridLayout(3, 2));
		
		//패널에 라벨과 텍스트필드를 차례로 담아요.
		p_input.add(new JLabel("아이디:"));
		p_input.add(jtf_id);
		p_input.add(new JLabel("이름:"));
		p_input.add(jtf_name);
		p_input.add(new JLabel("나이:"));
		p_input.add(jtf_age);
		
		//버튼4개를 생성합니다.
		JButton btnAdd = new JButton("등록");
		JButton btnUpdate = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		JButton btnList = new JButton("목록");
		
		//4개의 버튼을 담을 패널을 만들어요
		JPanel p_button= new JPanel();
		
		//순서대로 버튼을 배치하기 위하여 플로우레이아웃으로 설정합니다.
		p_button.setLayout(new FlowLayout());
		
		//버튼 4개를 차례로 패널에 담아요
		p_button.add(btnAdd);
		p_button.add(btnUpdate);
		p_button.add(btnDelete);
		p_button.add(btnList);
		
		
		//입력창이 담긴 패널과
		//버튼이 담긴 패널을 담을 패널을 만들어요
		JPanel p_south;
		p_south = new JPanel();
		
		//패널의 레이아웃을 보더레이웃으로 설정합니다.
		p_south.setLayout(new BorderLayout());
		
		//패널의 가운데에 입력창이 담긴 패널을 담아요
		p_south.add(p_input, BorderLayout.CENTER);
		
		//패널의 아래쪽에 버튼이 담긴 패널을 담아요
		p_south.add(p_button, BorderLayout.SOUTH);
		
		
		//입력창과 버튼이 담긴 패널을 프레이의 아래쪽에 담아요
		add(p_south, BorderLayout.SOUTH);
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//각각의 버튼에 이벤트를 등록합니다.
		btnAdd.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnList.addActionListener(this);
		
		//제이테이블에 마우스이벤트를 등록합니다.
		table.addMouseListener(this);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//눌러진 버튼의 글자를 읽어 옵니다.
		String cmd = e.getActionCommand();
		
		//눌러진 버튼의 글자에 따라 해당 일처를 위한 메소드를 호출합니다.
		switch(cmd) {
			case "등록":insertMember();break;
			case "수정":updateMember();break;
			case "삭제":deleteMember();break;
			case "목록":listMember();break;
		}
				
		
	}

	private void listMember() {
		//벡터의 데이터를 위한 rowData를 비워줍니다.
		rowData.clear();
		
		String sql = "select * from member";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
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

	private void deleteMember() {
		// TODO Auto-generated method stub
		
	}
		
	private void updateMember() {
		try {
			String id = jtf_id.getText();
			String name = jtf_name.getText();
			int age = Integer.parseInt(jtf_age.getText());	
			
			String sql = "update member set name='"+name+"',age="+age+" where id='"+id+"'";
			
			//jdbc드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//db서버에 연결한다.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			
			//데이터베이스 명령어를 실행하기 위한 객체를 생성한다.
			Statement stmt = conn.createStatement();
			
			// 데이터베이스 명령어를 실행	
			int re = stmt.executeUpdate(sql);
			if(re == 1) {
				JOptionPane.showMessageDialog(this, id+"회원의 정보를 수정하였습니다.");
				listMember();
			}else {
				JOptionPane.showMessageDialog(this, id+"회원의 정보를 수정하지 못하였습니다.");
			}
			
			//사용했던 자원을 닫아 줍니다.
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
		
	

	private void insertMember() {
		try {
			String id = jtf_id.getText();
			String name = jtf_name.getText();
			int age = Integer.parseInt(jtf_age.getText());
			
			String sql = "insert into member values('"+id+"','"+name+"',"+age+")";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			int re =stmt.executeUpdate(sql);
			if(re == 1) { 		//등록에 성공했으면
				listMember();	//다시 목록을 출력합니다.
			}else {
				JOptionPane.showMessageDialog(this, "고객등록에 실패하였습니다.");
			}
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		new MemberTest();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//제이테이블에서 선택한 행 번호를 읽어 옵니다.
		int row = table.getSelectedRow();
		
		//rowData로 부터 실제 데이터를 꺼집어 내어 옵니다.
		Vector<String> v= rowData.get(row);
		
		//아이디,이름,나이를 뽑아옵니다.
		String id = v.get(0);
		String name= v.get(1);
		String age = v.get(2);
		
		//뽑아온 아이디,이름,나이를 각각의 텍스트필드에 출력합니다.
		jtf_id.setText(id);
		jtf_name.setText(name);
		jtf_age.setText(age);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}