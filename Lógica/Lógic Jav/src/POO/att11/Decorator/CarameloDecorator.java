package att11.Decorator;

import att11.Contracts.ICafe;

public class CarameloDecorator extends AdicionalDecorator{
    public CarameloDecorator(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3.00;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com caramelo extra";
    }
}
