package att31.models;

import att31.contracts.ICafe;

public class Cafe implements ICafe {

    @Override
    public double getPreco() {
        return 20;
    }

    @Override
    public String getDescricao() {
        return "Cafe";
    }

}
