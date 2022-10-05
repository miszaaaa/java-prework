public class Ex12TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {20, -8, 13},
                {20, -8, 13},
                {20, -8, 13}
        };

        print2dArray(array);
    }

    static void print2dArray(int [][]arrayArg)
    {
        for(int i =0;i<arrayArg.length; i++) {
            for (int j = 0; j < arrayArg[i].length; j++) {
                System.out.println("(" + i + "," + j + "): " + arrayArg[i][j]);
            }
        }
    }
}
