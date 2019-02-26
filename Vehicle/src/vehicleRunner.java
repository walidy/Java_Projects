
public class vehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Adil's Car", 4, "Audi", 5000);

		car.getName();
		car.getPrice();
		car.numberOfWheels();

		System.out.println("The name of your car is: " + car.getName());
		System.out.println("The brand of your car is: " + car.getBrand());
		System.out.println("The price of your car is: " + car.getPrice());
		System.out.println("The number of wheels your car has: " + car.getWheels());
		System.out.println(" ");

		Jet jet = new Jet("Adonay's Jet", 5, 10000, "Midnight Black");

		jet.vehicleName();
		jet.vehiclePrice();
		jet.numberOfWheels();

		System.out.println("The name of your jet is: " + jet.getName());
		System.out.println("The price of your jet is: " + jet.getPrice());
		System.out.println("The number of wheels your jet has: " + jet.getWheels());
		System.out.println("The colour of your jet is: " + jet.getColour());
		System.out.println(" ");

		Motorcycle motorcycle = new Motorcycle("Ahmed's Bike", 2, 10000, "Large");

		jet.vehicleName();
		jet.vehiclePrice();
		jet.numberOfWheels();

		System.out.println("The name of your motorcycle is: " + motorcycle.getName());
		System.out.println("The price of your motorcycle is: " + motorcycle.getPrice());
		System.out.println("The number of wheels your motorcycle has: " + motorcycle.getWheels());
		System.out.println("The colour of your motorcycle is: " + motorcycle.getWheelSize());
		System.out.println(" ");

		Garage garage = new Garage();

		garage.addVehicle(car);
		garage.addVehicle(jet);
		garage.addVehicle(motorcycle);
		System.out.println(garage.vehicleList);

		System.out.println(garage.bill());

	}

}
