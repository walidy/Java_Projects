
public class Car extends Vehicles {

	private String brand;

	public Car(String name, int wheels, String brand, int price) {
		super(name, wheels, price);
		this.setBrand(brand);
	}

	public void vehicleName() {
	}

	public int getVehiclePrice() {
		return getPrice();
	}

	public void numberOfWheels() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
