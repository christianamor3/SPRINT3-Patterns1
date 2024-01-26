package n3exercici1.ConcreteClasses;

import n3exercici1.PetitionClass.Vehicle;

public class BreakingVehicle implements Order{

	private Vehicle vehicle;

	public BreakingVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.breaking();
	}
	
	
	
	
	
}
