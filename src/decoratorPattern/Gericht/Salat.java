package decoratorPattern.Gericht;

public class Salat extends Beilage{
    //concreteBeilage2


    public Salat(Gericht gericht) {
        super(gericht);
    }

    @Override
    public double getPreis() {
        return gericht.getPreis() + 2.25;
    }

    @Override
    public void druckeBeschreibung() {
gericht.druckeBeschreibung();
        System.out.print(", Salat");
    }
}
