
public class Motorcycle extends Vehicles {

	private String wheelSize;

	public Motorcycle(String name, int wheels, int price, String wheelSize) {
		super(name, wheels, price);
		this.setWheelSize(wheelSize);
		// TODO Auto-generated constructor stub
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void vehicleName() {
		// System.out.println("Enter the name of your motorcycle: ");
	}

	public int vehiclePrice() {
		return getPrice();
	}

	public void numberOfWheels() {
	}

	public void setWheelSize(String wheelSize) {
		this.wheelSize = wheelSize;
	}

	public String getWheelSize() {
		return wheelSize;
	}

}
