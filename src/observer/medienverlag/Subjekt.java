package observer.medienverlag;

public interface Subjekt {
    public void registerObserver(Beobachter beobachter);
    public void removeObserver(Beobachter beobachter);
    public void notifyObservers();
}
