package att11.Coffes;

import att11.Contracts.ICafe;

public abstract class BaseCoffe implements ICafe {
    private double preco = 10;
    private String descricao;

    public BaseCoffe(){
        this.preco *= 1;
        descricao = "Cafe";
    }

    public double getPreco(){return this.preco; }
    public String getDescricao(){return this.descricao; }

    @Override
    public String toString(){
        return getDescricao() + ", preço: " + getPreco();
    }
}
