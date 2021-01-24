package structuralPattern.mitarebeiterinnen;

public class ProvisionGewinn10 implements Provision{
    @Override
    public double berechneProvision(MitarbeiterIn m) {
        return m.getGewinn()/10;
    }
}
