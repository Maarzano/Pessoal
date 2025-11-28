package att31.models;

import att31.contracts.ICafe;

public class addLeiteCafe extends CafeDecorator  {

    public addLeiteCafe(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + ", com leite";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 2;
    }

}
