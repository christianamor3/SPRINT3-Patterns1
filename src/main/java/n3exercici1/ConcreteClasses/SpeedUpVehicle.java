package n3exercici1.ConcreteClasses;

import n3exercici1.PetitionClass.Vehicle;

public class SpeedUpVehicle implements Order{

	private Vehicle vehicle;

	public SpeedUpVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.speedUp();
	}
	
	
	
	
	
}
