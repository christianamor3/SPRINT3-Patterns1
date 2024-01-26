package n3exercici1.PetitionClass;

public class Boat implements Vehicle{

	private int id;
	
	public Boat(int id) {
		this.id = id;
	}

	@Override
	public void startUp() {
		System.out.println("Soy el barco " + id + " y estoy arrancando");	
	}

	@Override
	public void speedUp() {
		System.out.println("Soy el barco " + id + " y estoy acelerando");	
	}

	@Override
	public void breaking() {
		System.out.println("Soy el barco " + id + " y estoy frenando");	
	}

	
	
}
