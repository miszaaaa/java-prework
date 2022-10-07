public class ArraysExamples {
    public static void main(String[] args) {
        int[] array = new int[]{20, -8, 13, 1, 92, 2, 877, 32, 100};
        printArray(array);
        System.out.println(findMax(array));
        System.out.println("*** findMax *** KONIEC");
        System.out.println(sumArrayElements(array));
        System.out.println("*** sumArrayElements *** KONIEC");
        printArray(swapArrayElements(array));
        bubbleSortArrayElements(array);
        printArray(array);
    }
    static void printArray(int []array)
    {
        System.out.println("*** printArray *** START");
        for(int i =0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n*** printArray *** KONIEC");
    }
    static int findMax(int []array)
    {
        System.out.println("*** findMax *** START");
        int max = array[0];
        for(int i =1; i< array.length; i++)
        {
            if(max > array[i])
            {
                max = array[i];
            }
        }

        return max;
    }

    static int sumArrayElements(int []array)
    {
        System.out.println("*** sumArrayElements *** START");
        int sum = 0;
        for(int i =0; i< array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }


    static int [] swapArrayElements(int []array)
    {
        System.out.println("*** swapArrayElements *** START");
        int swap = 0;
        for(int i =0; i< array.length / 2; i++) {
            System.out.print("Zamieniam: " + array[i] + " ");
            swap = array[i];
            array[i] = array[array.length - i - 1];
            System.out.print("z: " + array[i] + " ");
            array[array.length - i - 1] = swap;
        }
        System.out.println("\n*** swapArrayElements *** KONIEC");
        return array;
    }

    static void bubbleSortArrayElements(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
