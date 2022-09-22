public class Sol03MinMax {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        int min = array[0], max = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(min > array[i])
            {
                min = array[i];
            }
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
