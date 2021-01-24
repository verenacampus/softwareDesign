package observer.wetterstation;

import java.util.ArrayList;

public class Wetterstation implements Subject{
    //Wetterstation = ConcreteSubject



    private ArrayList<Observer> observerArrayList;
    private double temperature;
    private double humidity;
    private double pressure;

    public Wetterstation() {
       observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
    observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
            for (Observer o : observerArrayList){
                o.update(temperature, humidity, pressure);
            }
    }

    public void setMeasurements(double t, double h, double p ){
        temperature = t;
        humidity = h;
        pressure = p;
        notifyObservers();
    }

}
