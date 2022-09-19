import java.util.Scanner;

public class Ex03IntType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter number:  "); // Wyświetlamy komunikat z prośbą o podanie liczby całkowitej.
        int number1; // Deklarujemy zmienną number1.
        number1 = scanner.nextInt(); // Pobieramy dane w postaci liczby od użytkownika.
        System.out.println("You entered: " + number1); // Wyświetlamy tekst: You entered i wprowadzona liczba.
        System.out.println("Result: " + (number1 + 1)); // Wyświetlamy wynik dodawania zmiennej number1 i 1.
    }
}
