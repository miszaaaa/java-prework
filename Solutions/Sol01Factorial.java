import java.util.Scanner;

public class Sol01Factorial {
    public static void main(String[] args) {
        System.out.println("Podaj wartość n: ");
        Scanner scanner = new Scanner(System.in);
        int n;
        n = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for(int i = 0; i < n; i++){
            result = result * (n - i);
        }
        System.out.println(result);
    }
}
