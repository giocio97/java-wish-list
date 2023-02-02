package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();

		Scanner s = new Scanner(System.in);
		String desiderio;
		do {
			System.out.println("inserisci un desirerio: (enter per uscire):  ");
			desiderio = s.nextLine();
			if (!desiderio.equals(""))
				wishList.add(desiderio);
		} while (!desiderio.equals(""));

		System.out.println("la tua lista desideri è :  ");
		for (int i = 0; i < wishList.size(); i++)
			System.out.println(wishList.get(i));

	}

}
