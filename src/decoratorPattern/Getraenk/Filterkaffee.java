package decoratorPattern.Getraenk;

public class Filterkaffee extends Getraenk{
//KonkreteKomponente2

    public Filterkaffee() {
        beschreibung = "Filterkaffee";
    }

    @Override
    public double kostet() {
        return 1.0;
    }
}
