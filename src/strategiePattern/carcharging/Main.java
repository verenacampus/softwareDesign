package strategiePattern.carcharging;

public class Main {
    public static void main(String[] args) {
        CarCharging carCharging = new CarCharging(new Car("Ford", 70), 10);
        MinuteStrategy minuteStrategy = new MinuteStrategy();
        System.out.println(carCharging.calcPrice(minuteStrategy));

        carCharging.getCar().setCharge(10);
        EnergyStrategy energyStrategy = new EnergyStrategy();
        System.out.println(carCharging.calcPrice(energyStrategy));

    }
}
