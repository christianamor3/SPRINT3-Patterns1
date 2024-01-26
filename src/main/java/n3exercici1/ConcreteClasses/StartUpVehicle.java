package n3exercici1.ConcreteClasses;

import n3exercici1.PetitionClass.Vehicle;

public class StartUpVehicle implements Order{

	private Vehicle vehicle;

	public StartUpVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.startUp();
	}
	
	
	
	
	
}
