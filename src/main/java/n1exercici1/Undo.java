package n1exercici1;

import java.util.ArrayList;

public class Undo {

	private static Undo instance;
	private static ArrayList<String> requests = new ArrayList<>();
	
	private Undo() {
		
	}
	
	public static Undo getInstance() {
		if(instance==null) {
			instance = new Undo();
		}
		
		return instance;
	}
	
	
	public void savingRequest(String request) {
		requests.add(request);
	}
	
	public void removingLastRequest() {
		if (!requests.isEmpty()) {
		requests.remove(requests.size()-1);
		} else {
			System.out.println("La llista de comandes esta buida");
		}
	}
	
	public void listOfRequests() {
		requests.stream().forEach(System.out::println);
	}
	
}
