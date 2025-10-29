package att16.src.Models;

import att16.src.Enums.Cargos;
import att16.src.FuncionarioFabric.IFuncionario;

public abstract class Funcionario implements IFuncionario {
    protected String nome;
    protected Cargos cargo;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ". Cargo: " + cargo + ". Salário: " + salario;
    }

    @Override
    public String getNome(){return this.nome;}
    @Override
    public Cargos getCargo(){return this.cargo;}
    @Override
    public double getSalario(){return this.salario;}

}
