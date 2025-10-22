package att11.Decorator;

import att11.Contracts.ICafe;

public class AcucarDecorator extends AdicionalDecorator {

    public AcucarDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.00;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com açucar extra";
    }
}
