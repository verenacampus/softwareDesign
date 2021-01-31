package factoryPattern.pizzastore;

public abstract class PizzaStore {
    //factory methode (= Code, der sich oft ändert)
    abstract Pizza createPizza(String item);

    //auch Aufruf der factory method
    public Pizza orderPizza (String type){
        Pizza pizza = createPizza(type);

        System.out.println("---- Making a " + pizza.getName() + " -----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
