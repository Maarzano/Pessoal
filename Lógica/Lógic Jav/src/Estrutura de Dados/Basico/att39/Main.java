package att39;

public class Main {
    public static void main(String[] args) {
        Tarefas tarefas = new Tarefas();

        tarefas.adicionarTarefa(new Tarefa("Lavar roupa", 5, "Maria"));
        tarefas.adicionarTarefa(new Tarefa("Estudar Java", 8, "Arthur"));
        tarefas.adicionarTarefa(new Tarefa("Lavar roupa", 10, "João"));
        tarefas.adicionarTarefa(new Tarefa("Fazer compras", 3, "Paula"));

        tarefas.listarPendentes();

        System.out.println("\nExecutando tarefa: " + tarefas.executarTarefa());

        tarefas.listarPendentes();
    }

}
