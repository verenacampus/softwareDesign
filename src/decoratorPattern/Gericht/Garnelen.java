package decoratorPattern.Gericht;

public class Garnelen implements Gericht{
//concreteComponent3
    @Override
    public double getPreis() {
        return 13.5;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.print("Garnelen");
    }
}

