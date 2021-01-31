package strategiePattern.berater;

public class Rechnung {
    private Berater berater;
    private  double stunden;

    public Rechnung(Berater berater, double stunden) {
        this.berater = berater;
        this.stunden = stunden;
    }

    public double calcPrice(IStrategie iStrategie){
        return iStrategie.calc(this);
    }

    public Berater getBerater() {
        return berater;
    }

    public double getStunden() {
        return stunden;
    }
}
