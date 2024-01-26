package n2exercici1.Products;

import n2exercici1.Interfaces.Address;

public class AddressEngland implements Address{

	private String country;
	private String city;
	private String street;
	private int postalCode;
	
	public AddressEngland() {
		
	}

	@Override
	public void setAddress(String city, String street, int postalCode) {
		this.country = "Inglaterra";
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;		
	}	
	
	@Override
	public String getAddress() {
		
		return country + ", " + city + ", " + street + ", " + postalCode;
	}
}

