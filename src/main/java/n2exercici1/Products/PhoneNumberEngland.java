package n2exercici1.Products;

import n2exercici1.Interfaces.PhoneNumber;

public class PhoneNumberEngland implements PhoneNumber{

	private String prefijo;
	private String numTelf;
	
	public PhoneNumberEngland() {
		
	}

	@Override
	public void setPhoneNumber(String numTelf) {
		prefijo = "+44";
		this.numTelf = numTelf;
	}
		

	@Override
	public String getPhoneNumber() {
		return prefijo + " " +numTelf;
	}
	
}

