package n3exercici1.PetitionClass;

public class Car implements Vehicle{

	private int id;
	
	public Car(int id) {
		this.id = id;
	}

	@Override
	public void startUp() {
		System.out.println("Soy el coche " + id + " y estoy arrancando");	
	}

	@Override
	public void speedUp() {
		System.out.println("Soy el coche " + id + " y estoy acelerando");	
	}

	@Override
	public void breaking() {
		System.out.println("Soy el coche " + id + " y estoy frenando");	
	}

	
	
}
