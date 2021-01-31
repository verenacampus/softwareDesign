package decoratorPattern.Getraenk;

public class Main {
    public static void main(String[] args) {
        //Espresso mit Milch
        Getraenk espressoMitMilch = new Espresso();
        System.out.println(espressoMitMilch.getBeschreibung());
        System.out.println(espressoMitMilch.kostet());
        //Milch wrappt Espresso
        espressoMitMilch = new Milch(espressoMitMilch);
        System.out.println("Espresso mit Milch: ");
        System.out.println(espressoMitMilch.getBeschreibung());
        System.out.println(espressoMitMilch.kostet());
    }
}
