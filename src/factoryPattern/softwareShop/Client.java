package factoryPattern.softwareShop;

public class Client {
    public static void main(String[] args) {
        SoftwareShop appleShop = new AppleiWorkFactory();
        OfficeProgramm appleTextProgram = appleShop.holeApp("Textverarbeitung");
        appleTextProgram.starten();

        SoftwareShop msShop = new MicrosoftOfficeFactory();
        OfficeProgramm wordPresProgram = msShop.holeApp("Präsentation");
        wordPresProgram.starten();
    }
}
