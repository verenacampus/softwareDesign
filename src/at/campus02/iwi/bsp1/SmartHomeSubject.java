package at.campus02.iwi.bsp1;

public interface SmartHomeSubject {
    public void registerObserver(SmartHomeObserver smartHomeObserver);
    public void removeObserver(SmartHomeObserver smartHomeObserver);
    public void notifyObservers();

}

