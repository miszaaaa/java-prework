public class Ex09Loops {
    public static void main(String[] args) {
        int i = 0;
        boolean d = i < 10;
        while (i < 10) {
            System.out.println("i = " + i);
            //i++;
        }

        int k;
        for (k = 0; k < 10; k++) {
            System.out.println("k = " + k);
        }

        int z = 0;
        do {
            System.out.println("z = " + z);
            z++;
        } while (z < 10);
    }
}
