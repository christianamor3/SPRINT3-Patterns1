package n1exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void programa(){
		Undo undo = Undo.getInstance();
		
		Boolean chivato = true;
		
		while (chivato) {
			chivato=menu(imprimirMenu(), undo, chivato);
		}
	}
	
	public static int imprimirMenu() {
		int resposta = 0;
        boolean acceptedInput = false;
        do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Quina d'aquestes funcions vols realitzar?");
			System.out.println("-----------");
			System.out.println("1. Introduir una comanda");
			System.out.println("-----------");
			System.out.println("2. Llegir les comandes");
			System.out.println("-----------");
			System.out.println("3. Tornar enrere");
			System.out.println("-----------");
			System.out.println("4. Sortir");
			try {
                resposta = sc.nextInt();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return resposta;
    }
	
	public static boolean menu(int resposta, Undo undo, Boolean chivato) {
		switch (resposta) {
			case 1:
				undo.savingRequest(doingRequest("Introdueix una tasca a realitzar"));
				break;
			case 2:
				undo.listOfRequests();
				break;
			case 3:
				undo.removingLastRequest();
				undo.listOfRequests();
				break;
			case 4:
				System.out.println("Fins aviat!");
				chivato=false;
			default:
				System.out.println("No has seleccionat una opcio disponible");
				break;
		}
		return chivato;
	}
	
	public static String doingRequest(String message) {
		Scanner sc = new Scanner(System.in);
		String request = "";
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                request = sc.nextLine();
                acceptedInput = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return request;
    }

}
