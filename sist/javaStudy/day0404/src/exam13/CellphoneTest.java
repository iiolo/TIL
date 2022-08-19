package exam13;

public class CellphoneTest {

	public static void main(String[] args) {
		Cellphone p1 = new Cellphone();
		Cellphone p2 = new Cellphone("Galaxy 21", "Samsung", "White", false, true);
		System.out.println("모델명: "+p1.getModel()+"\t"+
							"제조 회사: "+p1.getCompany()+"\t"+
							"색상: "+p1.getColor()+"\t"+
							"전원: "+p1.isPower()+"\t"+
							"카메라: "+p1.isCamera()
							);
		System.out.println("모델명: "+p2.getModel()+"\t"+
				"제조 회사: "+p2.getCompany()+"\t"+
				"색상: "+p2.getColor()+"\t"+
				"전원: "+p2.isPower()+"\t"+
				"카메라: "+p2.isCamera()
				);
	}

}
