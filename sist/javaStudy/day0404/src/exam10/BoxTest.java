package exam10;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20,30,50);
		b1.calVolume();
		b2.calVolume();
		System.out.println("����: "+b1.getWidth()+
							" ����: "+b1.getLength()+
							" ����: "+b1.getHeight()+
							" ����: "+b1.getVolume());
		System.out.println("����: "+b2.getWidth()+
				" ����: "+b2.getLength()+
				" ����: "+b2.getHeight()+
				" ����: "+b2.getVolume());

	}

}
