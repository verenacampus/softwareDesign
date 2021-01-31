package decoratorPattern.Gericht;

public abstract class Beilage implements Gericht{
    //abstract Decorator

    protected Gericht gericht;

    public Beilage(Gericht gericht) {
        this.gericht = gericht;
    }
}
