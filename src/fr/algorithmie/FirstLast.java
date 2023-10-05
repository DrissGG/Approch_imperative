package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] tableau = {3, 7, 24, 8, 3};
		
		boolean valeurBooleenne = tableau.length >= 1 && tableau[0] == tableau[tableau.length - 1];
		System.out.println(valeurBooleenne);
		  
		}


	

}
