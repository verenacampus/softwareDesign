package strategiePattern.Enten;

public class Stockente extends Ente {
    public Stockente(String name) {
        super(name, new Flatterflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente zeigt ihr prächtiges Federkleid");
    }
}
