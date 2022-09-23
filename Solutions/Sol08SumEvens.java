public class Sol08SumEvens {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i =0 ;i<array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
