package att16;

public class FolhaDePagamentoLegado {

    public static void main(String[] args) {
        // Dados dos funcionários em arrays paralelos.
        // Array 0: Nomes
        // Array 1: Cargos (1 = Gerente, 2 = Desenvolvedor, 3 = Estagiário)
        // Array 2: Salário Base (para Gerente/Dev) ou Valor/Hora (para Estagiário)
        // Array 3: Horas Trabalhadas (relevante apenas para Estagiário)

        String[] nomes = {"Ana", "Bruno", "Carla"};
        int[] cargos = {1, 2, 3};
        double[] valores = {6000.0, 4500.0, 20.0};
        int[] horas = {0, 0, 120}; // Horas trabalhadas no mês

        System.out.println("--- Relatório da Folha de Pagamento ---");
        processarPagamentos(nomes, cargos, valores, horas);
    }

    /**
     * Processa e imprime a folha de pagamento.
     * Este método calcula o salário final com base no cargo e imprime os detalhes.
     */
    public static void processarPagamentos(String[] nomes, int[] cargos, double[] valores, int[] horas) {
        
        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            int cargoTipo = cargos[i];
            double valor = valores[i];
            
            double salarioFinal = 0.0;
            String cargoNome = "";

            // Lógica de cálculo de salário baseada no tipo de cargo
            if (cargoTipo == 1) { // Gerente
                cargoNome = "Gerente";
                double bonus = valor * 0.15; // Gerentes recebem 15% de bônus
                salarioFinal = valor + bonus;
                
                System.out.println("Funcionário: " + nome);
                System.out.println("Cargo: " + cargoNome);
                System.out.println("Salário Base: R$ " + String.format("%.2f", valor));
                System.out.println("Bônus: R$ " + String.format("%.2f", bonus));
                System.out.println("Salário Final: R$ " + String.format("%.2f", salarioFinal));

            } else if (cargoTipo == 2) { // Desenvolvedor
                cargoNome = "Desenvolvedor";
                salarioFinal = valor; // Salário fixo
                
                System.out.println("Funcionário: " + nome);
                System.out.println("Cargo: " + cargoNome);
                System.out.println("Salário Fixo: R$ " + String.format("%.2f", salarioFinal));

            } else if (cargoTipo == 3) { // Estagiário
                cargoNome = "Estagiário";
                int horasTrabalhadas = horas[i];
                salarioFinal = valor * horasTrabalhadas; // Pagamento por hora
                
                System.out.println("Funcionário: " + nome);
                System.out.println("Cargo: " + cargoNome);
                System.out.println("Valor/Hora: R$ " + String.format("%.2f", valor));
                System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
                System.out.println("Salário Final: R$ " + String.format("%.2f", salarioFinal));
                
            } else {
                System.out.println("Funcionário: " + nome + " - Cargo desconhecido.");
            }

            System.out.println("----------------------------------------");
        }
    }
}