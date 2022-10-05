/*
 * Znajdowanie odległości pomiędzy najmniejszym i największym elementem tablicy
 * 1. Korzystając z pętli i operacji warunkowych oblicz odległość pomiędzy najmniejszym i największym elementem tablicy
 * */
public class Ex09MinMaxDistance {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        int min = array[0];
        int max = array[0];
        int i = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (i=0; i<array.length; i++){
            if (array[i]<min){
                min = array[i];
                minIndex = i;
            }
            if (array[i]>max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(Math.abs(minIndex - maxIndex));
    }
}
