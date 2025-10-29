package Revisao.att8;

import java.util.Objects;

public class Produto {
    private String nome;
    private int ID;

    public Produto(String nome, int ID){
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome(){return this.nome;}
    public int getID(){return this.ID;}

    @Override
    public int hashCode(){
        return Objects.hash(this.ID);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto prod = (Produto) o;
        return Objects.equals(this.ID, prod.ID);
    }

}
