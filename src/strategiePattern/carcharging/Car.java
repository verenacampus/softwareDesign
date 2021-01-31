package strategiePattern.carcharging;

public class Car {
    private String brand;

    //= Ladestand in kWh
    private double charge;
    //Kapazität der Batterie
    private double capacity;


    public Car(String brand, double charge) {
        this.brand = brand;
        this.charge = charge;
        this.capacity = charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public String getBrand() {
        return brand;
    }

    public double getCharge() {
        return charge;
    }

    public double getCapacity() {
        return capacity;
    }
}
