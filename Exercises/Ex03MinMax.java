/*
 * Znajdowanie najmniejszego i największego elementu
 * 1. Korzystając z pętli i operacji warunkowych znajdź najmniejszy i największy element tablicy array
 * 1. deklaruje dwie zmienne int min i max
 * 2. otwieram pętle
 * 3. sprawdzam czy aktualny element tablicy jest mniejszy od min
 * 4 jezeli jest to min staje sie aktualnym elementem tablicy
 * 5 sprawdzam czy aktualny element tablicy jest wiekszy od max
 * 6 jezeli jest to max staje sie aktualnym elementem tablicy
 * */
public class Ex03MinMax {
    public static void main(String[] args) {

        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
            int min = array[0];
            int max = array[0];
             for (int i = 1; i < array.length; i++){
                 if (array[i]<min){
                     min = array[i];
                 }
                 if (array[i]>max){
                     max = array[i];
                 }
             }
             System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
}
