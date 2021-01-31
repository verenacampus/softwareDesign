package decoratorPattern.Gericht;

public class Pommes extends Beilage{
    //concreteDecorator1
    public Pommes(Gericht gericht) {
        super(gericht);
    }

    @Override
    public double getPreis() {
        return gericht.getPreis() + 2.50;
    }

    @Override
    public void druckeBeschreibung() {
        gericht.druckeBeschreibung();
        System.out.print(", Pomes");
    }
}
