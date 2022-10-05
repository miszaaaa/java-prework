public class Ex17PrintArrayFunction {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44};
        int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 44};

        printArray(array1);
        printArray(array2);
        printArray(array3);
        printArray(array4);
    }
    static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
