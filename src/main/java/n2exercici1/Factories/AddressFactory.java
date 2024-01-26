package n2exercici1.Factories;

import n2exercici1.Interfaces.AbstractFactory;
import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.PhoneNumber;
import n2exercici1.Products.AddressSpain;
import n2exercici1.Products.AddressEngland;
import n2exercici1.Products.AddressItaly;

public class AddressFactory implements AbstractFactory{

	@Override
	public Address getAddress(String country) {
		if (country.equalsIgnoreCase("Spain")) {
			return new AddressSpain();
		} else if (country.equalsIgnoreCase("England")) {
			return new AddressEngland();
		} else if (country.equalsIgnoreCase("Italy")) {
			return new AddressItaly();
		} 
		return null;
	}

	@Override
	public PhoneNumber getPhoneNumber(String country) {
		return null;
	}

}
