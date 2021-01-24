package strategiePattern.HundescharWieEnten;

public class Husky extends Hund{


    public Husky() {
        super(new LautBellen(), new SchnellLaufen());
    }
}
