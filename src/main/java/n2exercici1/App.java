package n2exercici1;

import java.util.ArrayList;

import n2exercici1.Factories.FactoryProducer;
import n2exercici1.Interfaces.AbstractFactory;
import n2exercici1.Interfaces.Address;
import n2exercici1.Interfaces.PhoneNumber;

public class App {

	public static void main(String[] args) {

		ArrayList <Address> address = new ArrayList<>(); // Agenda direccions
		ArrayList <PhoneNumber> phoneNumber = new ArrayList<>(); // Agenda telefons

		
		AbstractFactory addressFactory = FactoryProducer.getFactory("Address");
		
		Address addressSpain = addressFactory.getAddress("Spain");
		Address addressEngland = addressFactory.getAddress("England");
		Address addressItaly = addressFactory.getAddress("Italy");
		
		addressSpain.setAddress("Barcelona", "Provença", 26);
		addressEngland.setAddress("London", "Oxford Street", 78);
		addressItaly.setAddress ("Roma", "Avenida Stazione", 12);
		
		address.add(addressSpain);
		address.add(addressEngland);
		address.add(addressItaly);
		
		address.stream().forEach(a -> System.out.println(a.getAddress()));
		
		AbstractFactory phoneNumberFactory = FactoryProducer.getFactory("PhoneNumber");
		
		PhoneNumber phoneNumberSpain = phoneNumberFactory.getPhoneNumber("Spain");
		PhoneNumber phoneNumberEngland = phoneNumberFactory.getPhoneNumber("England");
		PhoneNumber phoneNumberItaly = phoneNumberFactory.getPhoneNumber("Italy");
		
		phoneNumberSpain.setPhoneNumber("657847467");
		phoneNumberEngland.setPhoneNumber("89049484");
		phoneNumberItaly.setPhoneNumber("647474733");
		
		phoneNumber.add(phoneNumberSpain);
		phoneNumber.add(phoneNumberEngland);
		phoneNumber.add(phoneNumberItaly);
		
		phoneNumber.stream().forEach(pn -> System.out.println(pn.getPhoneNumber()));	
		
	}

}
