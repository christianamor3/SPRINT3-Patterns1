package n3exercici1;

import n3exercici1.ConcreteClasses.BreakingVehicle;
import n3exercici1.ConcreteClasses.SpeedUpVehicle;
import n3exercici1.ConcreteClasses.StartUpVehicle;
import n3exercici1.PetitionClass.Bike;
import n3exercici1.PetitionClass.Boat;
import n3exercici1.PetitionClass.Car;
import n3exercici1.PetitionClass.Plane;

public class CommandPatternDemo {

	public static void main(String[] args) {

		Car car1 = new Car(1);
		Bike bike1 = new Bike(1);
		Plane plane1 = new Plane(1);
		Boat boat1 = new Boat(1);
		
		StartUpVehicle startVehicle = new StartUpVehicle(plane1);
		SpeedUpVehicle speedVehicle = new SpeedUpVehicle(bike1);
		BreakingVehicle breakingVehicle = new BreakingVehicle(car1);
		
		Broker broker = new Broker();
		
		broker.takeOrder(startVehicle);
		broker.takeOrder(speedVehicle);
		broker.takeOrder(breakingVehicle);
		
		broker.placeOrders();
		
		
	}

}
