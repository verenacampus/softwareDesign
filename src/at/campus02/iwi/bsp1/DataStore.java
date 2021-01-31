package at.campus02.iwi.bsp1;


import java.util.ArrayList;

public class DataStore implements SmartHomeSubject{
    private double humidity;
    private boolean allWindowsClosed;
    private boolean allDoorsClosed;

    private ArrayList<SmartHomeObserver> observerArrayList;


    public DataStore() {
        this.humidity = 50;
        this.allWindowsClosed = false;
        this.allDoorsClosed = false;
        observerArrayList = new ArrayList<SmartHomeObserver>();
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
    public void registerObserver(SmartHomeObserver smartHomeObserver) {
        observerArrayList.add(smartHomeObserver);
    }

    @Override
    public void removeObserver(SmartHomeObserver smartHomeObserver) {
        observerArrayList.remove(smartHomeObserver);
    }

    @Override
    public void notifyObservers() {
        for(SmartHomeObserver o : observerArrayList){
            o.update();
        }
    }
}

