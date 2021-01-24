package observer.wetterstation;

public class DigitalDisplay implements Observer, DisplayElement {
    //ConcreteObserver


    // simples display kann nur temperatur anzeigen
    private double temperature;
    private Subject wetterDaten;

    public DigitalDisplay(Subject wetterDaten) {
        this.wetterDaten = wetterDaten;
        wetterDaten.registerObserver(this);
    }

    @Override
    public void display() {
        // Display aktualisieren (haetten wir das Interface DisplayElement
        // nicht dann wuerden wir das direkt im update machen)
        System.out.println("Digitalanzeige: " + temperature);

    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        temperature = temp;
        display();
    }
}
