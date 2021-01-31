package decoratorPattern.Gericht;

public class Main {
    public static void main(String[] args) {
        // = Client

        //gericht = Hüftsteak:
        Gericht gericht = new HueftSteak();
        gericht.druckeBeschreibung();
        System.out.println(" für €"+  gericht.getPreis());        System.out.println();

        System.out.println("dekoriert mit Salat:");
        //Salat wrappt Hüftsteak:
        gericht = new Salat(gericht);
        gericht.druckeBeschreibung();
        System.out.println(" für €"+  gericht.getPreis());        System.out.println();

        System.out.println("dekoriert mit Pommes:");
        //Pommes wrappt Salat (, der schon Hüftsteak wrappt)
        gericht = new Pommes(gericht);
        gericht.druckeBeschreibung();
        System.out.println(" für €"+  gericht.getPreis());

        //Tofu mit Pommes und Salat
        Gericht tofu = new Pommes(new Salat(new Tofu()));
        tofu.druckeBeschreibung();
        System.out.println(" für €"+  tofu.getPreis());        System.out.println();









    }
}
