public class Ex18AddArraysFunction {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int[] array5 = sumArrays(array1, array2);
        Ex17PrintArrayFunction.printArray(array5);
        int[] array6 = sumArrays(array2, array5);
        Ex17PrintArrayFunction.printArray(array6);
    }

    static int[] sumArrays(int[] tablica1, int[] tablica2){
        int arrayLength;
        if(tablica1.length > tablica2.length)
            arrayLength = tablica1.length;
        else
            arrayLength = tablica2.length;

        int[] tablica = new int[arrayLength];
        for (int i = 0; i<arrayLength; i++) {
            if (i > tablica1.length-1) {
                tablica[i] = tablica2[i];
            } else if (i > tablica2.length-1) {
                tablica[i] = tablica1[i];
            } else {
                tablica[i] = tablica1[i] + tablica2[i];
            }
        }
        return tablica;

    }
}

