package decoratorPattern.Getraenk;

public class Sirup extends ZutatDecorator{
    //KonkreterDekorator3
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Sirup";
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 1.0;
    }
}
