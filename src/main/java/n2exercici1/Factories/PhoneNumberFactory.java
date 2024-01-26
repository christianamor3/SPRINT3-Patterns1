package n2exercici1.Factories;

import n2exercici1.Interfaces.AbstractFactory;
import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.PhoneNumber;
import n2exercici1.Products.PhoneNumberEngland;
import n2exercici1.Products.PhoneNumberItaly;
import n2exercici1.Products.PhoneNumberSpain;

public class PhoneNumberFactory implements AbstractFactory{

	@Override
	public PhoneNumber getPhoneNumber(String country) {
		if (country.equalsIgnoreCase("Spain")) {
			return new PhoneNumberSpain();
		} else if (country.equalsIgnoreCase("England")) {
			return new PhoneNumberEngland();
		} else if (country.equalsIgnoreCase("Italy")) {
			return new PhoneNumberItaly();
		} 
		return null;
	}
	
	@Override
	public Address getAddress(String country) {
		return null;
	}

	

}
