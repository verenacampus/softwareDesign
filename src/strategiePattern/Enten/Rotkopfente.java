package strategiePattern.Enten;

public class Rotkopfente extends Ente {

    public Rotkopfente(String name) {
        super(name, new Segelflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Rotkopfente zeigt stolz ihren roten Kopf");

    }
}
