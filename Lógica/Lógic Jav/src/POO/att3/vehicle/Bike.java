package att3.vehicle;

public class Bike extends Vehicle{
    final private int capacity = 2;

    public Bike(String plate){
        super(plate);
    }

    @Override
    public int capacity(){
        return capacity;
    }

    @Override
    public String drive() {
        return "Digigindo moto";
    }


}
