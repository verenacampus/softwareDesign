package decoratorPattern.Gericht;

public class WienerSchnitzel implements Gericht{

    @Override
    public double getPreis() {
        return 10.5;
    }

    @Override
    public void druckeBeschreibung() {
        System.out.print("WienerSchnitzel");
    }
}
