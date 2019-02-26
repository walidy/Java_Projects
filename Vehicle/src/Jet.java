
public class Jet extends Vehicles {

	private String colour;

	public Jet(String name, int wheels, int price, String colour) {
		super(name, wheels, price);
		this.setColour(colour);
		// TODO Auto-generated constructor stub
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void vehicleName() {

	}

	public int vehiclePrice() {
		return getPrice();

	}

	public void numberOfWheels() {

	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

}
