package n2exercici1.Products;

import n2exercici1.Interfaces.PhoneNumber;

public class PhoneNumberItaly implements PhoneNumber{

	private String prefijo;
	private String numTelf;
	
	public PhoneNumberItaly() {
		
	}

	@Override
	public void setPhoneNumber(String numTelf) {
		prefijo = "+39";
		this.numTelf = numTelf;
	}
		

	@Override
	public String getPhoneNumber() {
		return prefijo + " " + numTelf;
	}
}

