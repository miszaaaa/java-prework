public class Sol06ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        int swap;
        for(int i = 0; i < array.length / 2; i++)
        {
            swap = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = swap;
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
