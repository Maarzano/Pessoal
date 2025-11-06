package att17.Pizzas;

public class PizzaCalabresa implements IPizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza calabresa");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza calabresa");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando pizza calabresa");
    }
}
