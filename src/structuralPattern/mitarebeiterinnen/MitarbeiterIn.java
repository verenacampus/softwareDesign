package structuralPattern.mitarebeiterinnen;

public class MitarbeiterIn  {


    private String name;
    private double umsatz;
    private  double gewinn;
    Provision provision;

    public MitarbeiterIn(String name, double umsatz, double gewinn, Provision provision) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
       this.provision = provision;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }

    @Override
    public String toString() {
        return "MitarbeiterInnen{" +
                "name='" + name + '\'' +
                ", umsatz=" + umsatz +
                ", gewinn=" + gewinn +
                '}';
    }

}
