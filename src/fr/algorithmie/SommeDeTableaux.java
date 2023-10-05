package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int [] array1= {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int [] array2={-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		if(array1.length != array2.length) {
			 System.out.println("Les tableaux n'ont pas la même longueur, la somme n'est pas possible.");
	            return; // Quitter le programme
		}
		// Créer un tableau pour stocker la somme
        int[] sommeTableaux = new int[array1.length];

        // Calculer la somme des éléments des deux tableaux
        for (int i = 0; i < array1.length; i++) {
            sommeTableaux[i] = array2[i] + array2[i];
        }
        // Afficher le tableau contenant la somme
        System.out.println("Tableau de la somme des éléments :");
        for (int i = 0; i < sommeTableaux.length; i++) {
            System.out.print(sommeTableaux[i] + " ");
        }


	}

}
