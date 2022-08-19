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
		//창 제목을 설정
		setTitle("회원삭제");
		
		//화면의 레이아웃을 순서대로 배치하는 방식을 설정
		setLayout(new FlowLayout());
		
		//텍스트필드를 생성
		jtf = new JTextField(10);
		
		//라벨을 생성
		JLabel label = new JLabel("삭제할 회원의 아이디:");
		
		//버튼을 생성
		JButton btn = new JButton("삭제");
		
		//버튼에 이벤트를 등록합니다.
		btn.addActionListener(this);
		
		//라벨을 프레임에 담아요
		add(label);
		
		//텍스트필드를 프레임에 담아요
		add(jtf);
		
		//버튼을 프레임에 담아요
		add(btn);
				
		//프레임크기를 설정
		setSize(450, 300);
		
		//프레임을 보이도록 설정
		setVisible(true);
		
		//닫기 버튼을 누르면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//삭제할 회원의 아이디를 변수에 저장합니다.
		String id = jtf.getText();
		
		//실행할 데이터베이스 명령어를 만들어요
		String sql =  "delete member where id = '"+id+"'";
		
		try {
			//jdbc드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. db서버에 연결한다.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			
			// 3. 데이터베이스 명령을 실행하기 위한 객체를 생성합니다.
			Statement stmt = conn.createStatement();
			
			// 4. 데이터베이스 명령어를 실행한 결과 값을 re로 저장
			int re =stmt.executeUpdate(sql);
			
			//5. 성공적으로 명령을 실행한 레코드의 수를 반환
			if(re == 1) {
				JOptionPane.showMessageDialog(this, "회원의 정보를 삭제하였습니다.");
			}else {
				JOptionPane.showMessageDialog(this, "회원의 정보삭제에 실패하였습니다.");
			}
			
			// 6. 사용했던 자원을 닫아 줍니다.
			stmt.close();
			conn.close();
		}catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//프레임을 생성하기
		new DeleteMemberGUI();
	}
}
