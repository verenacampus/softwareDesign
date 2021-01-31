package observer.smartHome;

import at.campus02.iwi.bsp1.SmartHomeObserver;
import at.campus02.iwi.bsp1.SmartHomeSubject;

import java.util.ArrayList;

public class DataStore implements SmartHomeSubject {
    private double humidity;
    private boolean allWindowsClosed;
    private boolean allDoorsClosed;

    private ArrayList<at.campus02.iwi.bsp1.SmartHomeObserver> observerArrayList;


    public DataStore() {
        this.humidity = 50;
        this.allWindowsClosed = false;
        this.allDoorsClosed = false;
        observerArrayList = new ArrayList<at.campus02.iwi.bsp1.SmartHomeObserver>();
    }

    public void setAllDoorsClosed(boolean allDoorsClosed) {

        this.allDoorsClosed = allDoorsClosed;
        notifyObservers();
    }
    public void setAllWindowsClosed(boolean allWindowsClosed) {

        this.allWindowsClosed = allWindowsClosed;
        notifyObservers();
    }
    public void setHumidity(double humidity) {

        this.humidity = humidity;
        notifyObservers();

    }
    public double getHumidity() {
        return humidity;
    }
    public boolean isAllDoorsClosed() {
        return allDoorsClosed;
    }
    public boolean isAllWindowsClosed() {
        return allWindowsClosed;
    }

    @Override
    public void registerObserver(at.campus02.iwi.bsp1.SmartHomeObserver smartHomeObserver) {
        observerArrayList.add(smartHomeObserver);
    }

    @Override
    public void removeObserver(at.campus02.iwi.bsp1.SmartHomeObserver smartHomeObserver) {
        observerArrayList.remove(smartHomeObserver);
    }

    @Override
    public void notifyObservers() {
        for(SmartHomeObserver o : observerArrayList){
            o.update();
        }
    }
}
