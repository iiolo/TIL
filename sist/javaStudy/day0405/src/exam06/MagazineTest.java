package exam06;

public class MagazineTest {
	public static void main(String[] args) {
		Book b = new Book("��ſ� �ڹ�", 600, "�����");
		Magazine m = new Magazine("�����ڹ�", 300, "�ֿ뱳������", "2022/04/05");
		
		System.out.println("������:"+b.getTitle()+
							",��������:"+b.getPage()+
							",����:"+b.getWriter());
		
		System.out.println("������:"+m.getTitle()+
				",��������:"+m.getPage()+
				",����:"+m.getWriter()+
				",�߸���:"+m.getReleaseDate());
		
		
	}

}
