package decoratorPattern.Getraenk;

public class Milchschaum  extends ZutatDecorator{
    //KonkreterDecorator2
    public Milchschaum(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milchschaum";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 1.10;
    }
}
