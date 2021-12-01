package org.generation.italy.christmas;

//import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// creare una nuova ArrayList dove salvare la lista dei desideri
		ArrayList<String> list = new ArrayList<String>();

		String listaDesideri;
		String continua;

		do {
			// ad ogni iterazione mostrare la lunghezza della lista e chiedere all置tente se
			// vuole continuare
			System.out.print("Aggiungi elemento alla lista dei dsideri: ");
			listaDesideri = scan.nextLine();
			list.add(listaDesideri);
			// ad ogni iterazione aggiungere il desiderio alla lista
			System.out.println("La tua lista contiene " + list.size() + " desiderio");
			System.out.print("Continuare? (s/n)");
			continua = scan.nextLine();
			// continuare a chiedere all置tente di inserire un nuovo desiderio nella lista,
			// fino a che l置tente sceglie di fermarsi
		} while (continua.equals("s"));

		// al termine dell段nserimento ordinare la lista
		System.out.println("Ecco la tua lista:");

		/*
		 * Iterator<String> iterator = list.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		// stampare a video la lista ordinata
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "- " + list.get(i));
		}
		scan.close();
	}

}
