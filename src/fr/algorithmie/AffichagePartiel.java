package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//afficher que les entiers supérieurs à 3 
		System.out.print("entiers supérieurs à 3 :");
		for(int i =0; i<array.length; i++) {
			if(array[i]>3) {
				System.out.print(array[i]+" ");
			}			
		}
		System.out.println();
		
		//afficher que les entiers pairs
		System.out.print("entiers pairs :");
		for(int i =0; i<array.length; i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}			
		}
		System.out.println();
		
		// Afficher les valeurs correspondant aux index pairs
        System.out.print("Valeurs correspondant aux index pairs : ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
		//afficher que les entiers impairs
		System.out.print("entiers impairs : ");
		for(int i =0; i<array.length; i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i]+" ");
			}			
		}

	}

}
