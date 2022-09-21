import java.util.Scanner;

public class Ex07Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy instancję klasy Scanner.
        System.out.print("Enter int value 1:  "); // Wyświetlamy komunikat z prośbą o wprowadzenie wartości.
        int value1; // Deklarujemy zmienną typu int.
        value1 = Integer.parseInt(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy do typu Int.

        System.out.print("Enter int value 2:  "); // Wyświetlamy komunikat z prośbą o wprowadzenie wartości.
        int value2; // Deklarujemy zmienną typu int.
        value2 = Integer.parseInt(scanner.next()); // Pobieramy dane od użytkownika i konwertujemy do typu Int.

        //Operator dodawania +
        System.out.println("result + : " + (value1 + value2));

        //Operator odejmowania -
        System.out.println("result - : " + (value1 - value2));

        //Operator mnożenia *
        System.out.println("result * : " + (value1 * value2));

        //Operator dzielenia / wynikiem dzielenia dwóch liczb typu int będzie liczba typu int zaokrąglona w dół
        System.out.println("result / : " + (value1 / value2));

        //Operator porównania ==  sprawdza czy podane wartości są równe. Wynikiem porównania jest prawda (true) albo fałsz (false)
        System.out.println("result == : " + (value1 == value2));

        //Operator przypisania = przypisuje do zmienne value1 wartość zmiennej value2
        System.out.println("result = : " + (value1 = value2));

        //Operator inkrementacji ++ zwiększa wartość zmiennej o 1. Jest równoznaczne z zapisem value1 = value1 + 1
        value1++;
        System.out.println("result = : " + (value1));

        //Operator dekrementacji -- zmniejsza wartość zmiennej o 1. Jest równoznaczne z zapisem value2 = value2 - 1
        value2--;
        System.out.println("result = : " + (value2));

        //Operator modulo % - zwraca resztę z dzielenia. Np. 3 % 2 = 1, 4 % 2 = 0 bo 4 przez 2 dzieli się bez reszty.
        System.out.println("result = : " + (value1 % value2));
    }
}
