package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		 // Afficher l'ensemble des éléments du tableau grâce à une boucle
		int[] l_array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for(int i=0; i<l_array.length; i++) {
			System.out.print(l_array[i]+ " ");
		}
		System.out.println(); //saut de ligne 
		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau 
		for(int i=l_array.length-1; i>=0; i--) {
			System.out.print(l_array[i]+ " ");
		}
		System.out.println();
		
		//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
		int [] arrayCopy = new int[l_array.length];
		
		for(int i=0; i<l_array.length; i++) {
			arrayCopy[i] = l_array[i];
		}
		// verification 
		System.out.print("Tableau arrayCopy : ");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]  + " ");
			}
	}

}
