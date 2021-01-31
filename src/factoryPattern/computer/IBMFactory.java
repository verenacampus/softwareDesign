package factoryPattern.computer;

public class IBMFactory extends Factory{
    @Override
    public Computer createComputer(ComputerType type) {
        if (type.equals(ComputerType.DESKTOP)){
            return new Desktop();
        }else if(type.equals(ComputerType.SERVER)){
            return new Server();
        } else return null;
    }
}
