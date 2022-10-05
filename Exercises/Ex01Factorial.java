/*
* Obliczanie silni z n
* 1. Pobierz wartość n od użytkownika i  skonwertuj na typ int
* 2. Korzystając z pętli oblicz wartość n!
* */

import java.util.Scanner;

public class Ex01Factorial {
    public static void main(String[] args) {
       System.out.println("Podaj wartość n:");
       Scanner scanner = new Scanner(System.in);
        int n;
        n = Integer.parseInt(scanner.nextLine());
        int silnia = 1;
        for (int i=0; i<n; i++){
            silnia = silnia * (n-i);
        }
        System.out.println("n! z " + n + " = " + silnia);
    }

        }
