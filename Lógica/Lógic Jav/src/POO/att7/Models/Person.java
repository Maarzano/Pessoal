package att7.Models;

import java.util.Objects;

import att7.Helpers.Cpf;

public class Person {
    private String nome;
    private Cpf cpf;

    public Person(String nome, Cpf cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cpf getCpf(){ return this.cpf; }
    public String getNome() { return this.nome; }


    @Override
    public String toString(){
        return nome + ", " + cpf;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person obj = (Person) o;

        return Objects.equals(this.getCpf(), obj.getCpf()) &&
                Objects.equals(this.getNome(), obj.getNome());
    }

    @Override
    public int hashCode(){
        return Objects.hash(cpf, nome);
    }

}
