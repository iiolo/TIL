package practice_0405book;

public class Book {
	String title;			//�������� ���� �ɹ�����
	int score;				//������ ���� �ɹ�����
	static int count;		//��� ������ ���� �����ϱ� ���� Ŭ���� ����
	public Book(String title, int score) {	//������
		super();
		this.title = title;
		this.score = score;
		count++;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
		count++;
	}
	@Override
	public String toString() {			//������ ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return "title=" + title + ", score=" + score + "";
	}	
}
