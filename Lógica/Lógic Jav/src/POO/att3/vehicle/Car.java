package att3.vehicle;

public class Car extends Vehicle{
    final private int capacity = 5;

    public Car(String plate){
        super(plate);
    }

    @Override
    public int capacity(){
        return capacity;
    }

    @Override
    public String drive(){
        return "Dirigindo carro";
    }

    public String openDoor() {
        return "Porta do carro aberta";
    }
}
