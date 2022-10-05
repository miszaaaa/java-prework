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


            System.out.println("Continue? (y/n)");
            run = scanner.next();
        }
    }
}
