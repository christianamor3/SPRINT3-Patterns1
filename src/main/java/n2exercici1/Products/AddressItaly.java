package n2exercici1.Products;

import n2exercici1.Interfaces.Address;

public class AddressItaly implements Address{

	private String country;
	private String city;
	private String street;
	private int postalCode;
	
	public AddressItaly() {
	}

	@Override
	public void setAddress(String city, String street, int postalCode) {
		this.country = "Italia";
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;	
	}
	
	@Override
	public String getAddress() {
		return country + ", " + city + ", " + street + ", " + postalCode;
	}	
}

