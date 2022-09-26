
public class Sol12AddArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array3Length = array1.length > array2.length? array1.length : array2.length;
        int[] array3 = new int [array3Length];
        int i = 0;
        while(i < array1.length && i <  array2.length)
        {
            array3[i] = array2[i] + array1[i];
            i++;
        }
        while(i<array1.length)
        {
            array3[i] = array1[i];
            i++;
        }
        while(i<array2.length)
        {
            array3[i] = array2[i];
            i++;
        }

        for(i = 0; i< array3Length; i++)
        {
            System.out.print(array3[i] + " ");
        }
    }
}
