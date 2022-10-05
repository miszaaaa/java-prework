/*
 * Wypisywanie wartości tablicy od ostatniego do pierwszego elementu
 * 1. Korzystając z pętli wypisz elementy tablicy array zaczynając od ostatniego i kończąc na pierwszym
 *
 * */
public class Ex02PrintReversed {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i<array.length; i++){
            System.out.println(array[array.length -1 -i]);

        }
        for (int i = array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
