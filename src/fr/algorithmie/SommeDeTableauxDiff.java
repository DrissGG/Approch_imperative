package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        // Trouver la longueur maximale entre les deux tableaux
        int longueurMax = Math.max(array1.length, array2.length);

        // Créer un tableau pour stocker la somme
        int[] sommeTableaux = new int[longueurMax];

        // Remplir les éléments manquants avec des zéros
        for (int i = 0; i < longueurMax; i++) {
            int valeurArray1 = (i < array1.length) ? array1[i] : 0;
            int valeurArray2 = (i < array2.length) ? array2[i] : 0;
            sommeTableaux[i] = valeurArray1 + valeurArray2;
        }

        // Afficher le tableau contenant la somme
        System.out.println("Tableau de la somme des éléments :");
        for (int i = 0; i < sommeTableaux.length; i++) {
            System.out.print(sommeTableaux[i] + " ");
        }
    }
}
