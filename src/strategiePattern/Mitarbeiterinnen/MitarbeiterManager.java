package strategiePattern.Mitarbeiterinnen;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private List<MitarbeiterIn> mitarbeiterInList = new ArrayList<>();

    private Provision provision;

    public MitarbeiterManager(Provision provision) {

        this.provision = provision;
    }

    public void addM (MitarbeiterIn m ){
        mitarbeiterInList.add(m);
    }

    public void setProvision(Provision provision) {

        this.provision = provision;
    }

    public void berechneProvisionAllerM(){
        for (MitarbeiterIn m : mitarbeiterInList){
            System.out.println(provision.berechneProvision(m));
        }
    }
}
