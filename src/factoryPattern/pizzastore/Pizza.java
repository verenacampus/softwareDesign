package factoryPattern.pizzastore;

public abstract class Pizza {

String name;

    public String getName() {
        return name;
    }

    void  prepare(){
        System.out.println("Prepare " + name);
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box (){
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        String display = "---- " + name + " ----\n";
    return display;
    }
}

