package strategiePattern.carcharging;

public class EnergyStrategy implements PricingStrategy{

    @Override
    public double calc(CarCharging carCharging) {

        return (carCharging.getCar().getCapacity() - carCharging.getCar().getCharge()) *0.2;
    }
}
