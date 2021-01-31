package factoryPattern.pizzastore;

public class WienPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("mushroom")) {
            return new WienMushroomPizza();
        } else if (item.equals("veggie")) {
            return new WienVeggiePizza();
        }else return null;

    }
}
