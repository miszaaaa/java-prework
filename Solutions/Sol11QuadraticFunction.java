import java.util.Scanner;

public class Sol11QuadraticFunction {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj wartość b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj wartość c: ");
        c = Integer.parseInt(scanner.nextLine());

        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta < 0)
        {
            System.out.println("Funkcja nie ma miejsc zerowych");
        }
        else if(delta == 0)
        {
            double x0 = (-1 * b) / (2 * a);
            System.out.println("Funkcja ma jedno miejsce zerowe: " + x0);
        }
        else
        {
            double x1 = (-1 * b - delta) / (2 * a);
            double x2 = (-1 * b + delta) / (2 * a);

            System.out.println("Funkcja ma dwa miejsca zerowe");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
