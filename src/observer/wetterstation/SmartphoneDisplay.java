package observer.wetterstation;

public class SmartphoneDisplay implements Observer, DisplayElement{
   //ConcreteObserver

    private double temperature;
   private  double pressure;
   //will humidity nicht wissen

    private Subject wetterDaten;

    public SmartphoneDisplay(Subject wetterDaten) {
        this.wetterDaten = wetterDaten;
        wetterDaten.registerObserver(this);
    }
    @Override
    public void update(double temp, double humidity, double pressure) {
        temperature =temp;
        this.pressure = pressure;

        display();
    }
    @Override
    public void display() {
        System.out.println("Smartphone: " + temperature + " " + pressure);

    }


}
