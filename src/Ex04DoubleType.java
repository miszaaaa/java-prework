import java.util.Scanner;

public class Ex04DoubleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter number:  "); // Wyświetlamy komunikat z prośbą o podanie liczby całkowitej.
        double number1; // Deklarujemy zmienną typu Double number1.
        number1 = Double.parseDouble(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy je na liczbę zmiennoprzecinkową.
        System.out.println("You entered: " + number1); // Wyświetlamy tekst: You entered i wprowadzona liczba.
        double result = number1 / 1.5; // Deklarujemy zmienną result w której będziemy przechowywać wynik dzielenia zmiennej number1 i 1.5
        System.out.println("number1 / 1.5 = " + result); // Wyświetlamy wartość result
    }
}
