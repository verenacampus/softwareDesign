package decoratorPattern.Getraenk;

public abstract class ZutatDecorator extends Getraenk{
    //Decorator wrappt eine Komponente
    protected Getraenk getraenk;

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    //zwingt alle davon ableitenden Klassen zu dieser Methode
    public abstract String getBeschreibung();
}
