public class Order {

    public enum PizzaMenu {
        CARBONARA,
        MARGARITA,
        PEPPERONI,
        MEATPIZZA
    }

    private String name;
    private PizzaMenu pizzaName;
    private Client client;


    public Order(String name) {
        this.name = name;
    }

    public void setOrder(PizzaMenu pizza, Client client) {
        this.pizzaName = pizza;
        this.client = client;
    }

    public PizzaMenu getOrder(){
        return pizzaName;
    }
}