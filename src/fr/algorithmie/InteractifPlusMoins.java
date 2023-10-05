package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nbAleatoire = random.nextInt(100)+1;
        int tentative =0;
        boolean trouveReponse = false;
        
        System.out.println("Devinez le nombre entre 1 et 100.");

        while (!trouveReponse) {
			System.out.println("entrez votre proposition : ");
			int proposition = scanner.nextInt();
			tentative++;
			
			if(proposition < nbAleatoire) {
				System.out.println("C'est plus");
			}else if (proposition > nbAleatoire) {
                System.out.println("C'est moins !");
            } else {
                trouveReponse = true;
                System.out.println("Bravo, vous avez trouvé en " + tentative + " coups.");
            }
			
		}

	}

}
