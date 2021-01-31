package strategiePattern.carcharging;

public class MinuteStrategy implements PricingStrategy{

    @Override
    public double calc(CarCharging carCharging) {
        return 0.45 *carCharging.getTime();
    }
}
