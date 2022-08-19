package exam01;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	
	//������ ȭ��� ���� ��,���� �����Ǵ� ȭ���� ���Ͽ� JTable�� ������
	JTable table;
	
	//JTable�� �� Į���̸��� ��� ���� ���͸� �����մϴ�.
	Vector<String> colNames;
	
	//JTable�� �� �����͸� ��� ���� ���͸� �����մϴ�.
	
	Vector<Vector<String>> rowData;
	
	public JTableTest() {
		
		//�÷��̸��� ���� ���͸� �����մϴ�.
		colNames = new Vector<String>();
		
		//���̺� ��� �����͸� ���� ���͸� �����մϴ�.
		rowData = new Vector<Vector<String>>();
		
		//�÷��̸��� ���Ϳ� �����͸� �߰��մϴ�.
		colNames.add("���̵�");
		colNames.add("�̸�");
		colNames.add("����");
		
		//���̺��� rowData�� �� ù��° ���ڵ带 ���� ���͸� �����մϴ�.
		Vector<String> row1 = new Vector<String>();
		
		//ù��° ���� �����͸� �߰��մϴ�.
		row1.add("tiger");
		row1.add("ȫ�浿");
		row1.add("20");
		
		//���̺��� �ι�° �࿡ �� ���ڵ带 ���Ͽ� ���͸� �����մϴ�.
		Vector<String> row2 = new Vector<String>();
		
		//�ι�°���� �����͸� �߰��մϴ�.
		row2.add("lion");
		row2.add("�����");
		row2.add("24");
		
		
		//����° ���� �����͸� ���� ���͸� �����մϴ�.
		Vector<String> row3 = new Vector<String>();
		
		//����° �࿡ �����͸� �߰��մϴ�.
		row3.add("kim");
		row3.add("������");
		row3.add("30");
		
		//rowData�� 
		//������ �����Ͱ� ��� ���͸� �߰��մϴ�.
		rowData.add(row1);
		rowData.add(row2);
		rowData.add(row3);
		
		
		//�������̺��� �����մϴ�.
		table = new JTable(rowData, colNames);
		
		
		//�ؽ�Ʈ����� ��ũ�������� ���ε���
		//�������̺� ��ũ�������� ���ξ� �մϴ�.
		JScrollPane jsp = new JScrollPane(table);
		
		//���̺��� ��� ��ũ������ �����ӿ� ��ƿ�
		add(jsp);
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}

	public static void main(String[] args) {		
		new JTableTest();
	}
}