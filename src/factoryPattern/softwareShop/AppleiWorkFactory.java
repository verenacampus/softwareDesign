package factoryPattern.softwareShop;

public class AppleiWorkFactory  extends SoftwareShop{
    @Override
    protected OfficeProgramm createOfficeProgram(String zuHolendesProg) {
        OfficeProgramm programm = null;
        if (zuHolendesProg.equals("Textverarbeitung")) {
            programm = new Pages();
        }
        else if (zuHolendesProg.equals("Präsentation")) {
            programm = new Keynode();
        }
        else if (zuHolendesProg.equals("Tabellenkalkulation")) {
            programm = new Numbers();
        }
        else {
            System.err.println("Ungültig!");
        }
        return programm;
    }
}
