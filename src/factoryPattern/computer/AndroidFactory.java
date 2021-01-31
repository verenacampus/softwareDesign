package factoryPattern.computer;

public class AndroidFactory extends Factory {
    @Override
    public Computer createComputer(ComputerType type) {
        if(type.equals(ComputerType.SMARTPHONE)){
            return new Smartphone();
        }else if(type.equals(ComputerType.TABLET)){
            return new Tablet();
        }else return null;
    }
}
