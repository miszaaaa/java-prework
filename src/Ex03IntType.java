import java.util.Scanner;

public class Ex03IntType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter number:  "); // Wyświetlamy komunikat z prośbą o podanie liczby.
        int number1; // Deklarujemy zmienną typu int.
        number1 = Integer.parseInt(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy je na liczbę typu int.
        System.out.println("You entered: " + number1); // Wyświetlamy tekst: You entered i wprowadzona liczba.
        int result = number1 + 1; // Deklarujemy zmienną result w której będziemy przechowywać wynik dodawania zmiennej number1 i 1
        System.out.println("number1 + 1 = " + result); // Wyświetlamy wartość result
    }
}
