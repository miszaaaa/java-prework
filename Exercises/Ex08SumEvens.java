/*
 * Sumowanie parzystych elementów tablicy array.
 * 1. Korzystając z pętli i operacji modulo oblicz sumę parzystych elementów tablicy.
 * */
public class Ex08SumEvens {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int i;

        for (i = 0; i<array.length; i++){
            if (array[i]%2 == 0 ){
                sum = sum + array[i];
            }

        }
        System.out.println(sum);
    }


}
