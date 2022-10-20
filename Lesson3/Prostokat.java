public class Prostokat extends Figura {
    private final double a;
    private final double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Pole() {
        return a * b;
    }

    @Override
    public double Obwod() {
        return 2 * a + 2 * b;
    }
}
