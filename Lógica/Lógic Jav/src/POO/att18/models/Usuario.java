package att18.models;

public class Usuario {
    public String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
