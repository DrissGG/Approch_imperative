package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int [] arrays= {4,3,1,99,21,6};
		int [] arraysVide= {};
		int [] arraysD= {6,5,7}; 
		
		boolean valeurBooleenne = arrays.length > 0 && (arrays[0] ==6 || arrays[arrays.length-1]==6);
		boolean valeurBooleenne2 = arraysVide.length > 0 && (arraysVide[0] ==6 || arraysVide[arraysVide.length-1]==6);
		boolean valeurBooleenne3 = arraysD.length > 0 && (arraysD[0] ==6 || arraysD[arraysD.length-1]==6);
		
		System.out.println("arrays :"+ valeurBooleenne);
		System.out.println("arraysVide :"+ valeurBooleenne2);
		System.out.println("arraysD :"+ valeurBooleenne3);
	}

}
