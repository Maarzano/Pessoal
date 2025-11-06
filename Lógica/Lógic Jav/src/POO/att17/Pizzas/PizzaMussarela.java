package att17.Pizzas;

public class PizzaMussarela implements IPizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza mussarela");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza mussarela");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando pizza mussarela");
    }
}
