package factoryPattern.computer;

public abstract class Factory {

    // HERE YOU CAN ADD METHODS
    public abstract Computer createComputer(ComputerType type);

    // DO NOT CHANGE METHOD SIGNATURE
    public Computer getComputer (ComputerType type) {

        // HERE YOU CAN ADD YOUR CODE
        Computer c = createComputer(type);


        // DO NOT CHANGE - WE WANT CLEAN COMPUTERS
        c.dust();

        return c;
    }
}
