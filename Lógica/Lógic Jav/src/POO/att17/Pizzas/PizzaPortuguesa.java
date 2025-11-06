package att17.Pizzas;

public class PizzaPortuguesa implements IPizza {

    @Override
    public void preparar() {
        System.out.println("Preparando pizza portuguesa");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza portuguesa");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando pizza portuguesa");
    }

}
