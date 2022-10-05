import java.util.Scanner;

public class Ex14SearchElementInArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia z tablicą");
        int number = Integer.parseInt(scanner.next());
        int i = 0;
        boolean znaleziono = false;
        for (i=0; i<array1.length; i++) {
            if (array1[i] == number) {
                znaleziono = true;
            }
        }
        System.out.println("znaleziono " + znaleziono);
   /*     if(znaleziono)
        {
            System.out.println("znaleziono " + number);
        }
        else {
            System.out.println("Nie znaleziono");
        }

    */

    }
}
