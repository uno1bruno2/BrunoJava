package main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Car> vehicles = new ArrayList<Car>();

	public void addCar(Car c) {
		vehicles.add(c);
	}

	public List<Car> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Car> vehicles) {
		this.vehicles = vehicles;
	}
	
	
}
