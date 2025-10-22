package att11.Coffes;


public class Expresso extends BaseCoffe{

    @Override
    public double getPreco(){
        return super.getPreco() * 3;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " expresso";
    }

}
