package att11.Coffes;

public class Latte extends BaseCoffe {
    @Override
    public double getPreco(){
        return super.getPreco() * 1.5;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " latte";
    }
}
