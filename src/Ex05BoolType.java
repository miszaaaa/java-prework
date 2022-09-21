import java.util.Scanner;

public class Ex05BoolType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter value:  "); // Wyświetlamy komunikat z prośbą o wprowadzenie wartości.
        boolean value; // Deklarujemy zmienną typu boolean value.
        value = Boolean.parseBoolean(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy je na wartość True / False.
        System.out.println("You entered: " + value); // Wyświetlamy tekst: You entered i wprowadzoną wartość.
    }
}
