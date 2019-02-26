
public abstract class Vehicles {

	private String name;
	private int wheels;
	private int price;

	public Vehicles(String name, int wheels, int price) {
		this.name = name;
		this.wheels = wheels;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWheels() {
		return wheels;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
