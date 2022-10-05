public class Ex21TwoDimensionalArrayFunction3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {20, -8, 13},
                {20, -8, 13},
                {20, -8, 13}
        };
        System.out.println(sumArrays(array));
    }
    static int sumArrays(int[][] tablica2d) {
        int wynik = 0;
        for (int i = 0; i < tablica2d.length; i++) {
            for (int j = 0; j < tablica2d[i].length; j++) {
                if (i+j+1== tablica2d.length){
                wynik = tablica2d[i][j] + wynik;}
            }
        }
        return wynik;
    }
}

