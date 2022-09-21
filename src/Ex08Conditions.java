import java.util.Scanner;

public class Ex08Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter number 1:  "); // Wyświetlamy komunikat z prośbą o podanie liczby.
        int number1; // Deklarujemy zmienną typu int.
        number1 = Integer.parseInt(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy je na liczbę typu int.
        System.out.print("Enter number 2:  "); // Wyświetlamy komunikat z prośbą o podanie liczby.
        int number2; // Deklarujemy zmienną typu int.
        number2 = Integer.parseInt(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy je na liczbę typu int.

        // Instrukcja warunkowa if służy do sprawdzania czy dany warunek został spełniony.
        // Np. czy saldo na karcie debetowej jest wystarczające aby wypłacić gotówkę z bankomatu.
        // Warunek rozpoczyna się od słowa if, następnie w nawiasach ( i ) sprawdzamy czy warunek jest spełniony.
        if (number1 == number2) { // Tutaj używamy operatora porównania żeby sprawdzić czy zmienne number1 i number2 są równe.
            System.out.print("Numbers are equal"); // Wypisujemy informacje, że liczby są równe.
        } else if (number1 > number2) { // Tutaj używamy operatora > żeby sprawdzić czy zmienna number1 jest większa od number2
            System.out.print("number1 is greater than number2"); // Wypisujemy informacje, że number1 jest większy niż number2
        } else { // Słowo kluczowe else, czyli "w przeciwnym wypadku". Kod po else będzie wykonany tylko w przypadku kiedy number1 nie jest większe od number2
            System.out.print("number2 is greater than number1");
        }
    }
}
