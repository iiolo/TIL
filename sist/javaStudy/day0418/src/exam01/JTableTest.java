package exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	
	//엑셀의 화면과 같이 행,열로 구성되는 화면을 위하여 JTable를 만들어요
	JTable table;
	
	//JTable에 들어갈 칼럼이름을 담기 위한 벡터를 선언합니다.
	Vector<String> colNames;
	
	//JTable에 들어갈 데이터를 담기 위한 벡터를 선언합니다.
	
	Vector<Vector<String>> rowData;
	
	public JTableTest() {
		
		//컬럼이름을 위한 벡터를 생성합니다.
		colNames = new Vector<String>();
		
		//테이블에 담길 데이터를 위한 벡터를 생성합니다.
		rowData = new Vector<Vector<String>>();
		
		//컬럼이름의 벡터에 데이터를 추가합니다.
		colNames.add("아이디");
		colNames.add("이름");
		colNames.add("나이");
		
		//테이블의 rowData에 들어갈 첫번째 레코드를 위한 벡터를 생성합니다.
		Vector<String> row1 = new Vector<String>();
		
		//첫번째 행의 데이터를 추가합니다.
		row1.add("tiger");
		row1.add("홍길동");
		row1.add("20");
		
		//테이블의 두번째 행에 들어갈 레코드를 위하여 벡터를 생성합니다.
		Vector<String> row2 = new Vector<String>();
		
		//두번째행의 데이터를 추가합니다.
		row2.add("lion");
		row2.add("김사자");
		row2.add("24");
		
		
		//세번째 행의 데이터를 위한 벡터를 생성합니다.
		Vector<String> row3 = new Vector<String>();
		
		//세번째 행에 데이터를 추가합니다.
		row3.add("kim");
		row3.add("김유신");
		row3.add("30");
		
		//rowData에 
		//각행의 데이터가 담긴 벡터를 추가합니다.
		rowData.add(row1);
		rowData.add(row2);
		rowData.add(row3);
		
		
		//제이테이블을 생성합니다.
		table = new JTable(rowData, colNames);
		
		
		//텍스트에리어를 스크롤팬으로 감싸듯이
		//제이테이블도 스크롤팬으로 감싸야 합니다.
		JScrollPane jsp = new JScrollPane(table);
		
		//테이블이 담긴 스크롤팬을 프레임에 담아요
		add(jsp);
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}

	public static void main(String[] args) {		
		new JTableTest();
	}
}