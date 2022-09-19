import java.util.Scanner; // Importujemy klasę Scanner do pobierania danych od użytkownika.

public class Ex02HelloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy tzw. instancję klasy Scanner
        System.out.print("Enter you name: "); // Wyświetlamy komunikat z prośbą o podanie imienia
        String name; // Deklarujemy zmienną name
        name = scanner.nextLine(); // Pobieramy dane tekstowe od użytkownika
        System.out.println("Hello " + name); // Wyświetlamy tekst Hello i wprowadzone imie
    }
}