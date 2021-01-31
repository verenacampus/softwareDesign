package factoryPattern.softwareShop;

public abstract class SoftwareShop {


    public  OfficeProgramm holeApp(String zuHolendesProg){
        OfficeProgramm programm = createOfficeProgram(zuHolendesProg);
        programm.einpacken();
        programm.etikettieren();
        return programm;
    }

    //Definition der Factory Method
    protected  abstract  OfficeProgramm createOfficeProgram(String zuHolendesProg);

}
