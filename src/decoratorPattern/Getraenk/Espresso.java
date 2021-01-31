package decoratorPattern.Getraenk;

public class Espresso extends Getraenk{
    //KonreteKomponente1

    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 1.90;
    }
}
