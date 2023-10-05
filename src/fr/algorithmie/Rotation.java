package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] arrays = {0, 1, 2, 3};
		
		int DernierElement = arrays[arrays.length-1];
		for (int i = arrays.length - 1; i > 0; i--) {
			arrays[i] = arrays[i - 1];
        }
		arrays[0] = DernierElement;
		
		System.out.print("Tableau après rotation : ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }

	}

}
