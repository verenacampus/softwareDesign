package strategiePattern.Mitarbeiterinnen;

public class UmsatzProvision implements Provision {


    @Override
    public double berechneProvision(MitarbeiterIn m) {
        return m.umsatz * 0.05;
    }
}
