package factoryPattern.pizzastore;

public class Main {
    public static void main(String[] args) {
        PizzaStore grazStore = new GrazPizzaStore();
        PizzaStore wienStore = new WienPizzaStore();

        Pizza pizza = grazStore.orderPizza("mushroom");
        System.out.println("Ich bestelle eine " + pizza.getName() + "\n");

        Pizza pizza2 = wienStore.orderPizza("veggie");
        System.out.println("Ich bestelle eine " + pizza2.getName() + "\n");
    }
}
