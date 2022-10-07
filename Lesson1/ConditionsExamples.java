public class ConditionsExamples {
    public static void main(String[] args) {
        printIfEqualNumbers(100,100);
        printIfDivisible(4,2);
        printMax(5, 10, 15);
        System.out.println("*** START checkIfNumberIsDivisibleByAOrB ***");
        System.out.println(checkIfNumberIsDivisibleByAOrB(64,8,4));
        System.out.println("*** KONIEC checkIfNumberIsDivisibleByAOrB ***");
    }

    static void printIfEqualNumbers(int a, int b)
    {
        System.out.println("*** START printIfEqualNumbers ***");
        if(a == b)
        {
            System.out.println("a i b są równe");
        }
        else
        {
            System.out.println("a i b są różne");
        }
        System.out.println("*** KONIEC printIfEqualNumbers ***");
    }

    static void printIfDivisible(int a, int b)
    {
        System.out.println("*** START printIfDivisible ***");
        if(a % b == 0)
        {
            System.out.println("a jest podzielne przez b");
        }
        else
        {
            System.out.println("a nie jest podzielne przez b");
        }
        System.out.println("*** END printIfDivisible ***");
    }

    static void printMax(int a, int b, int c)
    {
        System.out.println("*** START printMax ***");
        if(a > b && a > c)
        {
            System.out.println("a jest największe");
        }
        else if(b > a && b > c)
        {
            System.out.println("b jest największe");
        }
        else if(c > a && c > b)
        {
            System.out.println("c jest największe");
        }
        System.out.println("*** END printMax ***");
    }

    static boolean checkIfNumberIsDivisibleByAOrB(int number, int a, int b) {
        if (number % a == 0 || number % b == 0) {
            return true;
        }
        return false;
    }
}
