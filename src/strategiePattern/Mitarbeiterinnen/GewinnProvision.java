package strategiePattern.Mitarbeiterinnen;

public class GewinnProvision implements Provision{


    @Override
    public double berechneProvision(MitarbeiterIn m) {
        return m.gewinn * 0.1;
    }
}
