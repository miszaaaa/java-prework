/*
 * Obliczanie średniej wszystkich elementów tablicy
 * 1. Korzystając z pętli oblicz średnią ze wszystkich elementów tablicy array
 * */
public class Ex04Avg {
    public static void main(String[] args) {
        double[] array = new double[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        double sum = 0;

        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
        double average = sum/array.length;
        System.out.println(average);
    }

}
