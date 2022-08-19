package exam10;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20,30,50);
		b1.calVolume();
		b2.calVolume();
		System.out.println("가로: "+b1.getWidth()+
							" 세로: "+b1.getLength()+
							" 높이: "+b1.getHeight()+
							" 부피: "+b1.getVolume());
		System.out.println("가로: "+b2.getWidth()+
				" 세로: "+b2.getLength()+
				" 높이: "+b2.getHeight()+
				" 부피: "+b2.getVolume());

	}

}
