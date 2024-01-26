package n2exercici1.Factories;

import n2exercici1.Interfaces.AbstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Address")) {
			return new AddressFactory();
		} else if (factory.equalsIgnoreCase("PhoneNumber")) {
			return new PhoneNumberFactory();
		}
		return null;
	}
	
}
