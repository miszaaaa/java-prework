import java.util.Scanner;

public class Sol10BuildTriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj długość b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj długość c: ");
        c = Integer.parseInt(scanner.nextLine());
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
        }
    }
}
