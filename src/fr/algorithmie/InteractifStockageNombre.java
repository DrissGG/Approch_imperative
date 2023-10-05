package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tableau = new int[10]; // Tableau initial de taille 10
        int taille = 0; // Taille actuelle du tableau

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            if (choix == 1) {
                if (taille == tableau.length) {
                    // Si le tableau est plein, agrandir le tableau en créant un nouveau tableau
                    int nouvelleTaille = tableau.length * 2; // Double la taille du tableau
                    int[] nouveauTableau = new int[nouvelleTaille];

                    // Copier les éléments de l'ancien tableau vers le nouveau tableau
                    for (int i = 0; i < taille; i++) {
                        nouveauTableau[i] = tableau[i];
                    }

                    tableau = nouveauTableau; // Mettre à jour le tableau avec le nouveau tableau
                }

                // Demander à l'utilisateur d'ajouter un nombre
                System.out.print("Veuillez entrer un nombre : ");
                int nombre = scanner.nextInt();

                // Ajouter le nombre au tableau et augmenter la taille
                tableau[taille] = nombre;
                taille++;
            } else if (choix == 2) {
                // Afficher les nombres existants
                System.out.print("Nombres existants : ");
                for (int i = 0; i < taille; i++) {
                    System.out.print(tableau[i] + " ");
                }
                System.out.println();
            } else if (choix == 3) {
                // Quitter le programme
                break;
            } else {
                System.out.println("Option invalide. Veuillez choisir une option valide.");
            }
        }

        scanner.close();
    }
}
