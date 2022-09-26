import java.util.Scanner;

/*
 * Sprawdź czy z podanych odcinków można zbudować trójkąt
 * Zadeklaruj Scanner
 * wprowadz wartość zmiennej a
 * Wprowadz wartosc zmiennej b
 * wprowadz wartosc zmiennej c
 * sprawdz (if) czy a+b>c jezeli jest to nie mozna
 * jezeli nie (else if) to sprawdz a+ c > b jezeli jest to nie mozna
 * jezeli nie (else if) to sprawdz czy b + c > a jezeli jest to nie mozna
 * w przeciwnym wypadku (else) mozna zbudowac trojkąt
 * */
public class Ex10BuildTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("wprowadź zmienną a:");
        a = Integer.parseInt(scanner.next());
        System.out.println("wprowadź zmienną b:");
        b = Integer.parseInt(scanner.next());
        System.out.println("wprowadź zmienną c:");
        c = Integer.parseInt(scanner.next());

        if (a + b < c || b + c < a || c + a < b) {
            System.out.println("Nie uda się zbudować trójkąta");
        } else {
            System.out.println("Uda się zbudować trójkąt");
        }


        if (a + b >= c && b + c >= a && c + a >= b) {
            System.out.println("Uda się zbudować trójkąt");
        } else {
            System.out.println("Nie uda się zbudować trójkąta");
        }

        if (a+b<c){
            System.out.println("Nie uda się zbudować trójkąta");
        }
        else if (b+c<a){
            System.out.println("Nie uda się zbudować trójkąta");
        }
        else if (c+a<b){
            System.out.println("Nie uda się zbudować trójkąta");
        }
        else{
            System.out.println("Uda się zbudować trójkąt");
        }
    }
}
