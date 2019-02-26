import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	List<Vehicles> vehicleList = new ArrayList<Vehicles>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setVehiclesList(List<Vehicles> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<Vehicles> getVehiclesList() {
		return vehicleList;
	}

	public void addVehicle(Vehicles vehicle) {
		vehicleList.add(vehicle);
	}

	public int bill() {
		List<Integer> priceList = new ArrayList<Integer>();

		int cost = 0;

		priceList = vehicleList.stream().map(i -> i.getPrice()).collect(Collectors.toList());
		for (Integer i : priceList) {
			cost += i;
		}
		return cost;
	}

}
