package att17;

import att17.Pizzas.IPizza;
import att17.enums.EPizzas;

public class Main {
    public static void main(String[] args) {
        IPizza p = PizzaFactory.criarPizza(EPizzas.PORTUGUESA);
        IPizza p2 = PizzaFactory.criarPizza(EPizzas.CALABRESA);

        p.assar();
        p2.embalar();
    }

}
