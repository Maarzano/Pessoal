package att16.src;

import att16.src.Enums.Cargos;
import att16.src.FuncionarioFabric.FuncionarioFabric;
import att16.src.Models.Funcionario;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla"};
        Cargos[] cargos = {Cargos.GERENTE, Cargos.DESENVOLVEDOR, Cargos.ESTAGIARIO};
        double[] valores = {6000.0, 4500.0, 20.0};
        int[] horas = {0, 0, 120};

        System.out.println("--- Relatório da Folha de Pagamento ---");

        for (int i = 0; i < nomes.length; i++) {
            Funcionario funcionario;

            if (cargos[i] == Cargos.ESTAGIARIO) {
                funcionario = FuncionarioFabric.criarFuncionario(nomes[i], valores[i], horas[i]);
            } else {
                funcionario = FuncionarioFabric.criarFuncionario(cargos[i], nomes[i], valores[i]);
            }

            System.out.println(funcionario);
            System.out.println("----------------------------------------");
        }
    }
}
