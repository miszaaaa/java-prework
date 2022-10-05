/*
 * Odwrócenie kolejności elementów array, tak aby otrzymać {100, 32, 877, 2, 92, 1, 13, -8, 20};
 * 1. Korzystając z pętli i zmienne pomocniczej odwróć kolejność elementów tablicy array.
 * */
public class Ex06ReverseArray {
    public static void main(String[] args) {

        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100, 200, 88, 77, 66};
        int temp;
        int i;
        for (i = 0; i < array.length / 2; i++)
        {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]);
        }
    }

}





