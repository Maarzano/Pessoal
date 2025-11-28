package att31.models;

import att31.contracts.ICafe;

public abstract class CafeDecorator implements ICafe {
    private ICafe wrCafe;

    public CafeDecorator(ICafe cafe){
        this.wrCafe = cafe;
    }

    @Override
    public String getDescricao(){
        return wrCafe.getDescricao();
    }

    @Override
    public double getPreco(){
        return wrCafe.getPreco();
    }
}
