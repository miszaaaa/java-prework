public class Sol09MinMaxDistance {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        int min = array[0], max = array[0];
        int minIndex = 0, maxIndex = 0;
        for(int i = 1; i < array.length; i++)
        {
            if(min > array[i])
            {
                min = array[i];
                minIndex = i;
            }
            if(max < array[i])
            {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Distance: " + Math.abs(maxIndex - minIndex));
    }
}
