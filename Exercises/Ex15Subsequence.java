public class Ex15Subsequence {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] subsequence = new int[]{4, 5, 6};

        int i = 0;
        int k = 0;
        for (i = 0; i< array.length && k<subsequence.length; i++){
            System.out.println("i " + i);
            if (array[i] == subsequence[k]){
                k++;
                System.out.println("k " + k);
            }
        }
        if(k == subsequence.length)
        {
            System.out.println("Zawiera");
        }
    }
}
