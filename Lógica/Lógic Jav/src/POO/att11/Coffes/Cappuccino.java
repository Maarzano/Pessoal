package att11.Coffes;

public class Cappuccino extends BaseCoffe{
    
    @Override
    public double getPreco(){
        return super.getPreco() * 2;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " cappuccino";
    }

}
