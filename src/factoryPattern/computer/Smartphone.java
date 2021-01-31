package factoryPattern.computer;

public class Smartphone extends Computer {
    @Override
    public int getCPU() {
        return 1;
    }

    @Override
    public int getRAM() {
        return 1;
    }

    @Override
    public int getHDD() {
        return 32;
    }
}
