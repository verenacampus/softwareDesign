package decoratorPattern.Getraenk;

public abstract class Getraenk {
    // Komponente = abstrakt
    String beschreibung = "Unbekanntes Getraenk";

    public String getBeschreibung() {
        return beschreibung;
    }

    //abstrakte MethodeA
    public abstract double kostet();
}
