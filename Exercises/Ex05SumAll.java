/*
 * Obliczanie sumy wszystkich elementów tablicy
 * 1. Korzystając z pętli oblicz sumę wszystkich elementów tablicy array
 * */
public class Ex05SumAll {
    public static void main(String[] args) {
        int suma = 0;
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i] + ",");
            suma = suma + array[i];
            System.out.print(suma + ",");
          //  for (int i = 0; i < 9; i++) {
           //     System.out.print(array[i] + ",");
        }
        System.out.print("\n" + suma);
    }
}