package exam13;

public class CellphoneTest {

	public static void main(String[] args) {
		Cellphone p1 = new Cellphone();
		Cellphone p2 = new Cellphone("Galaxy 21", "Samsung", "White", false, true);
		System.out.println("�𵨸�: "+p1.getModel()+"\t"+
							"���� ȸ��: "+p1.getCompany()+"\t"+
							"����: "+p1.getColor()+"\t"+
							"����: "+p1.isPower()+"\t"+
							"ī�޶�: "+p1.isCamera()
							);
		System.out.println("�𵨸�: "+p2.getModel()+"\t"+
				"���� ȸ��: "+p2.getCompany()+"\t"+
				"����: "+p2.getColor()+"\t"+
				"����: "+p2.isPower()+"\t"+
				"ī�޶�: "+p2.isCamera()
				);
	}

}
