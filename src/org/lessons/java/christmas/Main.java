package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();

		Scanner s = new Scanner(System.in);
		String desiderio, sceltaUser;
		do {
			System.out.println("inserisci cosa desideri aggiungere alla tua wishlist:   ");
			desiderio = s.nextLine();
			System.out.println("vuoi  aggiungere altro? (si/no):   ");
			sceltaUser = s.nextLine();

			if (!sceltaUser.equals("no"))
				wishList.add(desiderio);
		} while (!sceltaUser.equals("no"));
		wishList.add(desiderio);

		System.out.println("la tua lista desideri è :  ");

		Collections.sort(wishList);
		System.out.println(wishList);

		s.close();

	}

}
