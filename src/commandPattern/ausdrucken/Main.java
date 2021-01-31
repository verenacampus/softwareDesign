package commandPattern.ausdrucken;

public class Main {
    public static void main(String[] args) {
        SchwarzweissDrucker schwarzweissDrucker = new SchwarzweissDrucker();
        Farbdrucker farbdrucker = new Farbdrucker();
        NadelDrucker nadelDrucker = new NadelDrucker();

        Sekraeter sekraeter = new Sekraeter();
        sekraeter.setDruckBefehl(new SchwarzWeissDruckBefehl(schwarzweissDrucker));
        sekraeter.druckAusloesen("blablabla");

        sekraeter.setDruckBefehl(new FarbDruckBefehl(farbdrucker));
        sekraeter.druckAusloesen("blablabla");
    }
}
