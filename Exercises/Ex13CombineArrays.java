//1. sprawdzamy ktora tablica jest wieksza
//2. deklarujemy array3 o dlugosci = dlugosci dluzszej tablicy



public class Ex13CombineArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int array3Length = array1.length + array2.length + array4.length;
        int[] array3 = new int[array3Length];
        int i = 0;
        while (i < array1.length) {
            array3[i] = array1[i];
            i++;
        }
        int k = 0;
        while (k < array2.length) {
            array3[i] = array2[k];
            k++;
            i++;
        }
        k = 0;
        while (k < array4.length) {
            array3[i] = array4[k];
            k++;
            i++;
        }
        for (i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
    }
}
