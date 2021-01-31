package observer.smartHome;

import at.campus02.iwi.bsp1.SmartHomeObserver;

public interface SmartHomeSubject {
    public void registerObserver(at.campus02.iwi.bsp1.SmartHomeObserver smartHomeObserver);
    public void removeObserver(SmartHomeObserver smartHomeObserver);
    public void notifyObservers();
}
