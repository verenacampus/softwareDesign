package decoratorPattern.Gericht;

public class Tofu implements Gericht {
//concreteComponent2
    @Override
    public double getPreis() {
        return 8.5;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.print("Tofu");
    }
}
