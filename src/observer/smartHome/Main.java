package observer.smartHome;

import at.campus02.iwi.bsp1.AlarmSystem;
import at.campus02.iwi.bsp1.DataStore;
import at.campus02.iwi.bsp1.IndoorClimate;

public class Main {
    public static void main(String[] args) {
        at.campus02.iwi.bsp1.DataStore dataStore = new DataStore();
        at.campus02.iwi.bsp1.AlarmSystem alarmSystem = new AlarmSystem(dataStore);
        at.campus02.iwi.bsp1.IndoorClimate indoorClimate = new IndoorClimate(dataStore);

        dataStore.setHumidity(71);
    }
}
