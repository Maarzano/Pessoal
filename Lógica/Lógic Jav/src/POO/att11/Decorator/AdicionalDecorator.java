package att11.Decorator;

import att11.Contracts.ICafe;

public abstract class AdicionalDecorator implements ICafe{
    protected ICafe cafe;

    public AdicionalDecorator(ICafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double getPreco() {
        return cafe.getPreco();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public String toString(){
        return getDescricao() + getPreco();
    }
}
