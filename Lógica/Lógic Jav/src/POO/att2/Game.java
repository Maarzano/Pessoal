package att2;


public class Game {
    private String name;
    private float price;
    private boolean disponible;

    public Game(String name, float price){
        this.name = name;
        this.price = price;
        this.disponible = true;
    }

    public String getName(){ return this.name; }
    public float getPrice(){ return this.price; }
    public boolean isDisponible(){ return this.disponible; }

    public void buy(){ 
        if (disponible){
            disponible = false;
        }
    }
    
    public void sell(){ disponible = true; }

}
