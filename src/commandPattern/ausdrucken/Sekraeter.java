package commandPattern.ausdrucken;

public class Sekraeter {
    //Aufrufer

    private DruckBefehl druckBefehl;

    public void setDruckBefehl(DruckBefehl druckBefehl) {
        this.druckBefehl = druckBefehl;
    }

    public void druckAusloesen(String dokument){
        druckBefehl.ausfuehren(dokument);
    }



}
