
public class LoopsExamples {
    public static void main(String[] args)
    {
        printNumbersForLoop(5);
        printNumbersWhileLoop(10);
        System.out.println("*** sumNumbersForLoop Start ***");
        System.out.println(sumNumbersForLoop(10));
        System.out.println("*** sumNumbersForLoop Koniec ***");
        System.out.println("*** sumNumbersWhileLoop Start ***");
        System.out.println(sumNumbersWhileLoop(20));
        System.out.println("*** sumNumbersWhileLoop Koniec ***");
        System.out.println("*** sumEvenNumbersForLoop Start ***");
        System.out.println(sumEvenNumbersForLoop(20));
        System.out.println("*** sumEvenNumbersForLoop Koniec ***");
        System.out.println("*** calculatePowWhileLoop Start ***");
        System.out.println("Wynik: " + calculatePowWhileLoop(2,4));
        System.out.println("*** calculatePowWhileLoop Koniec ***");
    }
    static void printNumbersForLoop(int count){
        System.out.println("*** printNumbersForLoop Start ***");
        for(int i =0; i <= count;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("*** printNumbersForLoop Koniec ***");
    }

    static void printNumbersWhileLoop(int count){
        int i = 0;
        System.out.println("*** printNumbersWhileLoop Start ***");
        while(i <= count)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("*** printNumbersWhileLoop Koniec ***");
    }

    static int sumNumbersForLoop(int count) {
        int sum = 0;
        System.out.println("Suma: " + sum);
        for (int i = 1; i <= count; i++) {
            sum = sum + i;
            System.out.println("Suma: " + sum + " w " + i + " kroku.");
        }

        return sum;
    }

    static int sumNumbersWhileLoop(int count){
        int i = 1, sum = 0;
        System.out.println("Suma: " + sum);
        while(i <= count)
        {
            sum = sum + i;
            System.out.println("Suma: " + sum + " w " + i + " kroku.");
            i++;
        }
        return sum;
    }

    static int sumEvenNumbersForLoop(int count) {
        int sum = 0;
        System.out.println("Suma: " + sum);
        for (int i = 0; i <= count; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println("Suma: " + sum + " w " + i + " kroku.");
                System.out.println(i + " jest parzyste");
            } else {
                System.out.println(i + " nie jest parzyste");
            }
        }
        return sum;
    }

    static int calculatePowWhileLoop(int number, int pow){
        int i = 2;
        int root = number;

        if(pow == 0)
            return 1;

        while(i <= pow)
        {
            number = number * root;
            System.out.print(root + " do potęgi: " + i + " = " + number + "\n");
            i++;
        }

        return number;
    }
}
