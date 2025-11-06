package att17;

import att17.Pizzas.IPizza;
import att17.Pizzas.PizzaCalabresa;
import att17.Pizzas.PizzaMussarela;
import att17.Pizzas.PizzaPortuguesa;
import att17.enums.EPizzas;

public class PizzaFactory {
    public static IPizza criarPizza(EPizzas pizza){
        switch (pizza) {
            case MUSSARELA:
                return new PizzaMussarela();
            case CALABRESA:
                return new PizzaCalabresa();
            case PORTUGUESA:
                return new PizzaPortuguesa();
        
            default:
                throw new IllegalArgumentException("Tipo de pizza inexistente");
        }
    }
}
