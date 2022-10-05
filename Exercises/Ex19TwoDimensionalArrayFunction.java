public class Ex19TwoDimensionalArrayFunction {
    public static void main(String[] args) {
        System.out.println("Start");
        int [][] wynik = create2dArray(2,2);
        for(int i =0;i<wynik.length; i++) {
            for (int j = 0; j < wynik[i].length; j++) {
                System.out.println("(" + i + "," + j + "): " + wynik[i][j]);
            }
        }
        System.out.println("End");
        //Ex12TwoDimensionalArray.print2dArray(create2dArray(2,2));
    }
    static int[][] create2dArray(int n,int m){
        System.out.println("Start create2dArray");
        int[][] tablica = new  int[n][m];
        for (int i=0; i<tablica.length; i++){
            for (int j=0; j<tablica[i].length; j++) {
                tablica[i][j]=0;

            }
        }
        System.out.println("End create2dArray");
        return tablica;
    }
}
