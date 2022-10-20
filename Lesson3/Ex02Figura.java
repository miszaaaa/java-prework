import java.util.ArrayList;

public class Ex02Figura {
    public static void main(String[] args) {
        ArrayList<Figura> figury = new ArrayList<Figura>();
        Kwadrat kwadrat = new Kwadrat(10);
        Prostokat prostokat = new Prostokat(5, 10);
        figury.add(kwadrat);
        figury.add(prostokat);
        for (Figura f : figury) {
            System.out.println("Figura: " + f.getClass().getName() + " Pole: " + f.Pole() + " Obwod: " + f.Obwod());
        }
    }
}
