package att16.src.Models;

import att16.src.Enums.Cargos;

public class Gerente extends Funcionario{

    private static final double BONUS = 1.15;

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.cargo = Cargos.GERENTE;
    }

    @Override
    public double getSalario(){
        return this.salario + (this.salario * BONUS);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               " | Cargo: " + cargo +
               " | Salário Base: R$ " + String.format("%.2f", salario) +
               " | Bônus: R$ " + String.format("%.2f", salario * BONUS) +
               " | Salário Final: R$ " + String.format("%.2f", getSalario());
    }

}
