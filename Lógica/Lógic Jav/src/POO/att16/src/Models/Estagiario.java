package att16.src.Models;

import att16.src.Enums.Cargos;

public class Estagiario extends Funcionario{
    private int horasTrabalhadas;

    public Estagiario(String nome, double salario, int horasTrabalhadas) {
        super(nome, salario * horasTrabalhadas);
        this.cargo = Cargos.ESTAGIARIO;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return super.toString() + " (Horas Trabalhadas: " + horasTrabalhadas + ")";
    }
}
