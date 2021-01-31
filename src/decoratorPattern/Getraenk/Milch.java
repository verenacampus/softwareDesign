package decoratorPattern.Getraenk;

public class Milch extends ZutatDecorator{
    //KonkreterDecorator1 kann Komponente erweitern

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milch";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.80;
    }
}
