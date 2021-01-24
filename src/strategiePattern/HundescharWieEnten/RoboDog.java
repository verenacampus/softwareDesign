package strategiePattern.HundescharWieEnten;

public class RoboDog extends Hund{
    public RoboDog() {
        super(new ElektronischBellen(), new NormalLaufen());
    }
}
