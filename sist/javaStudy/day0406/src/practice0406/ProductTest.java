package practice0406;

class Product {
	protected String name;
	protected int price;

	public double getPrice() {
		return price;
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}

class DiscountProduct extends Product {
	private double discount;
	private double discountPrice;

	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}

	@Override
	public double getPrice() {
		discountPrice = price - (price * discount * 0.01);
		return discountPrice;
	}

	@Override
	public String toString() {
		return "DiscountProduct [discountPrice=" + discountPrice + ", name=" + name + "]";
	}

}

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("toothbrush", 3000);
		Product p2 = new DiscountProduct("toothbrush", 3000, 15.0);

		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		System.out.println(p1);
		System.out.println(p2);

	}

}
