/*Crie um sistema para gerenciar tarefas por prioridade:

Cada tarefa tem uma descrição e um nível de prioridade (1 a 5).
Insira algumas tarefas na PriorityQueue.
Exiba as tarefas na ordem de prioridade. */


import java.util.*;

public class Att25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> tarefas = new PriorityQueue<>(Comparator.comparingInt(tarefa -> Integer.parseInt(tarefa.split(":")[0])));

        System.out.println("Gerenciador de Tarefas - Insira tarefas com prioridade (1 a 5)");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Exibir tarefas por prioridade");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

        	switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Nível de prioridade (1 a 5): ");
                    int prioridade = scanner.nextInt();

                    if (prioridade < 1 || prioridade > 5) {
                        System.out.println("A prioridade deve estar entre 1 e 5.");
                    } else {
                        tarefas.add(prioridade + ":" + descricao);
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa na fila.");
                    } else {
                        System.out.println("\nTarefas por ordem de prioridade:");
                        while (!tarefas.isEmpty()) {
                            String tarefa = tarefas.poll();
                            String[] partes = tarefa.split(":");
                            System.out.println("Prioridade: " + partes[0] + " | Descrição: " + partes[1]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
