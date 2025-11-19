package att25.models;

public class Gateway {
    
    boolean pagar(double price){
        System.out.println("Tentando pagar... R$ " + price);
        return price > 0;
    };
}
