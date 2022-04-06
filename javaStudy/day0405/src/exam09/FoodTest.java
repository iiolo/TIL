package exam09;

class Food{
	protected double calorie;
	protected int price;
	protected double weight;
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Food(double calorie, int price, double weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getInfo() {
		return "Ä®·Î¸®:"+calorie+",°¡°Ý:"+price+",Áß·®:"+weight;
	}
}


class Melon extends Food{
	private String farm;

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public Melon(double calorie, int price, double weight, String farm) {
		super(calorie, price, weight);
		this.farm = farm;
	}

	public Melon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getInfo(){
		return "Ä®·Î¸®:"+calorie +",°¡°Ý:"+price+",Áß·®:"+weight+",°æÀÛ³ó¿ø:"+farm;
	}
}


public class FoodTest {
	public static void main(String[] args) {
		Food f = new Food(100, 2000, 100);
		System.out.println(f.getInfo());
		
		Melon m = new Melon(200, 12000, 1000, "½Ö¿ë³ó¿ø");
		System.out.println(m.getInfo());
	}
}





