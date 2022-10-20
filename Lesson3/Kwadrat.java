public class Kwadrat extends Figura {
    private final double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double Pole() {
        return a * a;
    }

    @Override
    public double Obwod() {
        return 4 * a;
    }
}
