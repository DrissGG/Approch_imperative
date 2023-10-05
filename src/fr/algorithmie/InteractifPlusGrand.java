package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nombreMax = Integer.MIN_VALUE; // Initialisation à la plus petite valeur possible

        for (int i = 1; i <= 10; i++) {
            System.out.print("Veuillez entrer le nombre #" + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > nombreMax) {
                nombreMax = nombre;
            }
        }

        System.out.println("Le plus grand nombre parmi les 10 nombres est : " + nombreMax);

        scanner.close();
    }
}

