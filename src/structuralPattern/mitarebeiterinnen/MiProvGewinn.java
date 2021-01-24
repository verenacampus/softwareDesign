package structuralPattern.mitarebeiterinnen;

public class MiProvGewinn extends MitarbeiterIn {


    public MiProvGewinn(String name, double umsatz, double gewinn) {
        super(name, umsatz, gewinn, new ProvisionGewinn10());
    }
}
