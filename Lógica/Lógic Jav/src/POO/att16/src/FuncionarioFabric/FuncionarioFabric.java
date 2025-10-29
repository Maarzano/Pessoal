package att16.src.FuncionarioFabric;

import att16.src.Enums.Cargos;
import att16.src.Models.Desenvolvedor;
import att16.src.Models.Estagiario;
import att16.src.Models.Funcionario;
import att16.src.Models.Gerente;

public class FuncionarioFabric {
    public static Funcionario criarFuncionario(Cargos cargo, String nome, double salario){
        switch (cargo) {
            case DESENVOLVEDOR:
                return new Desenvolvedor(nome, salario);
            case GERENTE:
                return new Gerente(nome, salario);
            default:
                throw new IllegalArgumentException("Tipo de cargo inválido");
        }
    }
    public static Funcionario criarFuncionario(String nome, double salario, int horasTrabalhadas){
        return new Estagiario(nome, salario, horasTrabalhadas);
    }

}
