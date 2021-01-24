package strategiePattern.HundescharWieEnten;

public class Dackel extends Hund{
    public Dackel() {
        super(new LeiseBellen(), new LangsamLaufen());
    }
}
