package observer.smartHome;

import at.campus02.iwi.bsp1.DataStore;
import at.campus02.iwi.bsp1.SmartHomeObserver;

public class IndoorClimate implements SmartHomeObserver {
    private boolean shouldOpenWindows;
    private at.campus02.iwi.bsp1.DataStore data;


    public IndoorClimate(DataStore data) {
        this.data = data;
        data.registerObserver(this);
        shouldOpenWindows = false;
    }

    public boolean isShouldOpenWindows() {
        return shouldOpenWindows;
    }


    @Override
    public void update() {
        if(data.getHumidity() >= 70){
            shouldOpenWindows = true;
            System.out.println("Fenster sind offen");
        } else {
            shouldOpenWindows = false;
            System.out.println("Fenster sind geschlossen");
        }
    }
}
