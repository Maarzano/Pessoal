package att16.src.Models;

import att16.src.Enums.Cargos;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        this.cargo = Cargos.DESENVOLVEDOR;
    }
}
