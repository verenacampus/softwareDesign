package factoryPattern.softwareShop;

public class SunOpenOfficeFactory extends SoftwareShop{
    @Override
    protected OfficeProgramm createOfficeProgram(String zuHolendesProg) {
        OfficeProgramm programm = null;
        if (zuHolendesProg.equals("Textverarbeitung")) {
            programm = new Write();
        }
        else {
            System.err.println("Ungültig!");
        }
        return programm;
    }
}
