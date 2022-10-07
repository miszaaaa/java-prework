public class TwoDimensionalArraysExamples {
    public static void main(String[] args)
    {
        int[][] array = new int[][]{
                {20, -8, 13},
                {20, -8, 13},
                {20, -8, 13}
        };
        print2dArray(array);
        System.out.println(sum2dArray(array));
        System.out.println(sumEvens2dArray(array));
        System.out.println(sumDiagonals2dArray(array));
    }
    static void print2dArray(int [][] array)
    {
        System.out.println("*** print2dArray *** START");
        for(int i =0;i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("(" + i + "," + j + "): " + array[i][j]);
            }
        }
        System.out.println("*** print2dArray *** KONIEC");
    }

    static int sum2dArray(int [][] array) {
        int sum = 0;
        System.out.println("*** sum2dArray *** START");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("(" + i + ", " + j + "): " + array[i][j]);
                sum = sum + array[i][j];
            }
        }
        System.out.println("*** sum2dArray *** KONIEC");
        return sum;
    }
    static int sumEvens2dArray(int [][] array)
    {
        int sum = 0;
        System.out.println("*** sumEvens2dArray *** START");
        for(int i =0;i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] % 2 == 0)
                {
                    System.out.println("(" + i + ", " + j + "): " + array[i][j]);
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("*** sumEvens2dArray *** KONIEC");
        return sum;
    }

    static int sumDiagonals2dArray(int [][] array)
    {
        int sum = 0;
        for(int i =0;i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j)
                {
                    System.out.println("(" + i + ", " + j + "): " + array[i][j]);
                    sum = sum + array[i][j];
                }
                if(i + j == array.length - 1)
                {
                    System.out.println("(" + i + ", " + j + "): " + array[i][j]);
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
}
