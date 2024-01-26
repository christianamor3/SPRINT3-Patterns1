package n3exercici1.PetitionClass;

public class Bike implements Vehicle{

	private int id;
	
	public Bike(int id) {
		this.id = id;
	}

	@Override
	public void startUp() {
		System.out.println("Soy la bici " + id + " y estoy arrancando");	
	}

	@Override
	public void speedUp() {
		System.out.println("Soy la bici " + id + " y estoy acelerando");	
	}

	@Override
	public void breaking() {
		System.out.println("Soy la bici " + id + " y estoy frenando");	
	}

	
	
}
