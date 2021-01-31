package observer.smartHome;

import at.campus02.iwi.bsp1.DataStore;
import at.campus02.iwi.bsp1.SmartHomeObserver;

public class AlarmSystem implements SmartHomeObserver {
    private boolean canBeActivated;
    private at.campus02.iwi.bsp1.DataStore data;



    public AlarmSystem(DataStore data) {
        this.data = data;
        data.registerObserver(this);
        canBeActivated = false;
    }

    public boolean isCanBeActivated() {
        return canBeActivated;
    }


    @Override
    public void update() {
        if(data.isAllDoorsClosed() && data.isAllWindowsClosed()){
            canBeActivated = true;
            System.out.println("Alarmsystem ist aktiviert");
        } else {
            canBeActivated = false;
            System.out.println("Alarmsystem ist nicht aktiviert");
        }
    }
}
