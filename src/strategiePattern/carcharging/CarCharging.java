package strategiePattern.carcharging;

public class CarCharging {
    private Car car;
    private double time;


    public double calcPrice(PricingStrategy pricingStrategy){
        return pricingStrategy.calc(this);
    }

    public CarCharging(Car car, double time) {
        this.car = car;
        this.time = time;
    }

    public Car getCar() {
        return car;
    }

    public double getTime() {
        return time;
    }
}
