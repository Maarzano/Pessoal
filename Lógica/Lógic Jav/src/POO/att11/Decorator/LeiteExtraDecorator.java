package att11.Decorator;

import att11.Contracts.ICafe;

public class LeiteExtraDecorator extends AdicionalDecorator{

    public LeiteExtraDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 2;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " com leite extra";
    }

}
