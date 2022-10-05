import java.util.Scanner;

public class Ex16CalcFunctions {
    public static void main(String[] args) {
        String run = "y";
        Scanner scanner = new Scanner(System.in);
        int operation = -1;
        while(run.equals("y"))
        {
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to sub");
            System.out.println("Press 3 to multiply");
            System.out.println("Press 4 to divide");
            operation = Integer.parseInt(scanner.next());
            double number1 = Double.parseDouble(scanner.next());
            System.out.println("Wprowadź drugą liczbę");
            double number2 = Double.parseDouble(scanner.next());
            System.out.println("Wynik");
            double wynik = 0;
            if(operation == 1)
                System.out.println(dodaj(number1, number2));
            if(operation == 2)
                System.out.println(odejmij(number1, number2));
            if(operation == 3)
                System.out.println(multiply(number1, number2));
            if(operation == 4)
                System.out.println(divide(number1, number2));

            System.out.println("Continue? (y/n)");
            run = scanner.next();
        }
    }

    static double dodaj(double a, double b) {
        return a + b;
    }

    static double odejmij(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    } static double divide(double a, double b) {
        return a / b;
    }
}
