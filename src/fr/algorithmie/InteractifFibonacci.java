package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un rang N pour la suite de Fibonacci : ");
        int n = scanner.nextInt();

        int fibonacciN = calculerFibonacci(n);

        System.out.println("Le nombre de rang " + n + " dans la suite de Fibonacci est : " + fibonacciN);

        scanner.close();
    }

    static int calculerFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int resultat = 0;

            for (int i = 2; i <= n; i++) {
                resultat = a + b;
                a = b;
                b = resultat;
            }

            return resultat;
        }
    }
}

