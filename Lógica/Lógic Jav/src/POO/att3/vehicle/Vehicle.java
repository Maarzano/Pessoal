package att3.vehicle;

import att3.Contracts.IDrivable;

public abstract class Vehicle implements IDrivable {
    private final String plate;
    

    public Vehicle(String plate){
        this.plate = plate;
    }

    public String getPlate(){
        return this.plate;
    }

    public abstract int capacity();

    public String start(){
        return getPlate() + " iniciando...";
    }

    @Override
    public String toString(){
        return "Placa " + getPlate();
    }
}
