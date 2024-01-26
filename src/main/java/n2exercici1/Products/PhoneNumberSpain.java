package n2exercici1.Products;

import n2exercici1.Interfaces.PhoneNumber;

public class PhoneNumberSpain implements PhoneNumber{

	private String prefijo;
	private String numTelf;
	
	public PhoneNumberSpain() {
		
	}
		

	@Override
	public void setPhoneNumber(String numTelf) {
		prefijo = "+34";
		this.numTelf = numTelf;
	}
		

	@Override
	public String getPhoneNumber() {
		return prefijo + " " + numTelf;
	}
	
}
