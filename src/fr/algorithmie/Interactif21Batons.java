package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batonsRestants = 21;
        boolean tourJoueur = true; // true pour le joueur, false pour l'ordinateur

        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Vous jouez contre l'ordinateur.");
        System.out.println("À chaque tour, vous pouvez retirer 1, 2 ou 3 bâtons.");
        System.out.println("Celui qui prend le dernier bâton a perdu.");

        while (batonsRestants > 0) {
            if (tourJoueur) {
                // Tour du joueur
                System.out.print("Combien de bâtons souhaitez-vous retirer (1, 2 ou 3) ? ");
                int choixJoueur = scanner.nextInt();

                if (choixJoueur >= 1 && choixJoueur <= 3 && choixJoueur <= batonsRestants) {
                    batonsRestants -= choixJoueur;
                    tourJoueur = false;
                } else {
                    System.out.println("Choix invalide. Vous pouvez retirer de 1 à 3 bâtons.");
                }
            } else {
                // Tour de l'ordinateur (joue de manière aléatoire)
                int choixOrdinateur = random.nextInt(3) + 1;
                System.out.println("L'ordinateur retire " + choixOrdinateur + " bâton(s).");
                batonsRestants -= choixOrdinateur;
                tourJoueur = true;
            }

            // Afficher le nombre de bâtons restants
            System.out.println("Bâtons restants : " + batonsRestants);
        }

        if (!tourJoueur) {
            System.out.println("Bravo, vous avez gagné !");
        } else {
            System.out.println("L'ordinateur a gagné. Vous avez perdu.");
        }

        scanner.close();
    }
}

