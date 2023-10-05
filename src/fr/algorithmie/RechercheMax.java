package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Initialiser la variable max avec la première valeur du tableau
        int max = array[0];
		 for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
		 // Afficher le maximum trouvé
	     System.out.println("Le plus grand élément du tableau est : " + max);


	}

}
