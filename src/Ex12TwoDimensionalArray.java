public class Ex12TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {20, -8, 13},
                {20, -8, 13},
                {20, -8, 13}
        };

        for(int i =0;i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("(" + i + "," + j + "): " + array[i][j]);
            }
        }
    }
}
