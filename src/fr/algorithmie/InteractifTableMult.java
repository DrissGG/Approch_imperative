package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int nb ;
		do {
			System.out.println("entre un nbre entre 1 et 10: ");
			nb = scanner.nextInt(); 
						
		
		} while (nb>10 || nb<1 );
		
		for (int i = 1; i <= 10; i++) {
            int resultat = nb * i;
            System.out.println(nb + " x " + i + " = " + resultat);
        }
		
	}


}
