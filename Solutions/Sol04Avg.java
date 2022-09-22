public class Sol04Avg {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        double sum = 0, avg = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        avg = sum / array.length;
        System.out.println("Avg: " + avg);
    }
}
