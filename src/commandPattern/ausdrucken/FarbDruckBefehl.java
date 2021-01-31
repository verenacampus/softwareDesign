package commandPattern.ausdrucken;

public class FarbDruckBefehl implements DruckBefehl{
    private Farbdrucker drucker;

    public FarbDruckBefehl(Farbdrucker drucker) {
        this.drucker = drucker;
    }

    @Override
    public void ausfuehren(String dokument) {
        drucker.drucken(dokument);
    }
}
