package n2exercici1.Interfaces;

public interface AbstractFactory {

	Address getAddress(String country);
	PhoneNumber getPhoneNumber(String country);
	
}
