package strategiePattern.Mitarbeiterinnen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    MitarbeiterManager manager = new MitarbeiterManager(new UmsatzProvision());

    manager.addM(new MitarbeiterIn("Susi", 10000, 200));
    manager.addM(new MitarbeiterIn("Herbert", 1500, 100));

    manager.berechneProvisionAllerM();
    manager.setProvision(new GewinnProvision());
    manager.berechneProvisionAllerM();


    }


}
