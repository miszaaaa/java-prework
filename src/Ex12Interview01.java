import java.util.Scanner;

public class Ex12Interview01 {
    public static void main(String[] args) {
        // Napisz program, który przyjmuje wartość liczbową (całkowitą) i jeżeli wartość jest podzielna przez 3
        // wyświetla open
        // jeżeli podzielna przez 5 wyświetla finance
        // jeżeli podzielna przez 3 i 5 wyświetla open finance

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę:");
        int liczba;
        liczba = Integer.parseInt(scanner.next());
        if (liczba % 3 == 0 && liczba % 5 == 0) {
            System.out.println("open finance");
        } else if (liczba % 3 == 0) {
            System.out.print("open");
        } else if (liczba % 5 == 0) {
            System.out.print("finance");
        }


        if (liczba % 3 == 0){
            System.out.print("open ");
        }
        if (liczba % 5 == 0){
            System.out.println("finance");
        }

        //else if (liczba %3 ==0, %5==0) {
        //  System.out.println("open finance");
    }
}

