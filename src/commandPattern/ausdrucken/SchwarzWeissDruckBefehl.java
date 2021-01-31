package commandPattern.ausdrucken;

import javax.swing.*;

public class SchwarzWeissDruckBefehl implements DruckBefehl {
    private SchwarzweissDrucker drucker;

    public SchwarzWeissDruckBefehl(SchwarzweissDrucker drucker) {
        this.drucker = drucker;
    }

    @Override
    public void ausfuehren(String dokument) {
        drucker.konfigurieren();
        drucker.drucken(dokument);
    }
}
