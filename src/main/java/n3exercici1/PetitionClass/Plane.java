package n3exercici1.PetitionClass;

public class Plane implements Vehicle{

	private int id;
	
	public Plane(int id) {
		this.id = id;
	}

	@Override
	public void startUp() {
		System.out.println("Soy el avion " + id + " y estoy arrancando");	
	}

	@Override
	public void speedUp() {
		System.out.println("Soy el avion " + id + " y estoy acelerando");	
	}

	@Override
	public void breaking() {
		System.out.println("Soy el avion " + id + " y estoy frenando");	
	}

	
	
}
