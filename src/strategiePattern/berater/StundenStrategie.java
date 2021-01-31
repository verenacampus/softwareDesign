package strategiePattern.berater;

public class StundenStrategie implements  IStrategie{
    @Override
    public double calc(Rechnung rechnung) {
        return rechnung.getStunden()*rechnung.getBerater().getStundensatz();
    }
}
