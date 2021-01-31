package factoryPattern.softwareShop;

public class MicrosoftOfficeFactory extends SoftwareShop{
    @Override
    protected OfficeProgramm createOfficeProgram(String zuHolendesProg) {
        OfficeProgramm programm = null;
        if(zuHolendesProg.equals("Textverarbeitung")){
            programm = new Word();
        } else if (zuHolendesProg.equals("Präsentation")) {
            programm = new Powerpoint();
        }
        else if (zuHolendesProg.equals("Tabellenkalkulation")) {
            programm = new Excel();
        }
        else {
            System.err.println("Ungültig!");
        }
        return programm;

    }
}
