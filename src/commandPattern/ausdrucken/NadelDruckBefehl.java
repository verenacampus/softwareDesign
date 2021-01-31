package commandPattern.ausdrucken;

public class NadelDruckBefehl implements DruckBefehl {
    private NadelDrucker drucker;

    public NadelDruckBefehl(NadelDrucker drucker) {
        this.drucker = drucker;
    }

    @Override
    public void ausfuehren(String dokument) {
        drucker.umstaendlichKonfigurieren();
        drucker.drucken(dokument);
    }
}
