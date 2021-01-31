package decoratorPattern.Gericht;

public class HueftSteak implements Gericht {
    //concreteComponent1

    @Override
    public double getPreis() {
        return 13.0;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.print("Hüftsteak");
    }
}

