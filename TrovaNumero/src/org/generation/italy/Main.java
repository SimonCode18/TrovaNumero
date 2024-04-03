package org.generation.italy;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random R = new Random();
		int n = R.nextInt(100)+1;
		int x;
		Scanner sc =new Scanner(System.in);
		
		
		do {
			System.out.println("Indovinare il numero generato da 1 a 100");
			x = Integer.parseInt(sc.nextLine());
			if (x == n) {
				System.out.println("Hai indovinato il numero!");
			}
			else {
				 
					if (x < n) {
						System.out.println("Il numero da indovinare e' piu grande");
					}
					if (x > n) {
						System.out.println("Il numero da indovinare e' piu piccolo");
					}
				
			}
		} while(x!=n);

		sc.close();
		
	}

}
