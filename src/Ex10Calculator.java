import java.util.Scanner;

public class Ex10Calculator {
    public static void main(String[] args) {
        String run = "y";
        Scanner scanner = new Scanner(System.in);
        byte operation = -1;
        while(run.equals("y"))
        {
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to sub");
            System.out.println("Press 3 to multiply");
            System.out.println("Press 4 to divide");
            operation = Byte.parseByte(scanner.next());
            System.out.println("Wprowadź pierwszą liczbę");
            double number1 = Double.parseDouble(scanner.next());
            System.out.println("Wprowadź drugą liczbę");
            double number2 = Double.parseDouble(scanner.next());
            System.out.println("Wynik");


            if(operation == 1) {
                System.out.println(number1 + number2);
            }
            if(operation == 2) {
                System.out.println(number1 - number2);
            }
            if(operation == 3) {
                System.out.println(number1 * number2);
            }
            if(operation == 4) {
                System.out.println(number1 / number2);
            }
            System.out.println("Continue? (y/n)");
            run = scanner.next();
        }
    }
}
