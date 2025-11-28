package att31.models;

import att31.contracts.ICafe;

public class addAcucarCafe extends CafeDecorator {

    public addAcucarCafe(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + ", com açucar";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 1.5;
    }

}
