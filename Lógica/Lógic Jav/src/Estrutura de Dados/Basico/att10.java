import java.util.LinkedList;
import java.util.Scanner;

public class att10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminarSistema = false;
        LinkedList<String> listaTarefas = new LinkedList<>();

        while (!terminarSistema){

        
            System.out.println("\nBEM VINDO AO SISTEMA\nVocê tem algumas opções");
            System.out.println("1. adicionar tarefas\n2. Concluir tarefa\n3. Sair do sistema\n4. listar tarefas");
            String escolha = sc.nextLine();

            switch(escolha){
                case "1":
                    System.out.print("Escreva o nome da tarefa: ");
                    String tarefa = sc.nextLine();
                    if (listaTarefas.contains(tarefa)){
                        System.out.println("\nJá tem essa tarefa");
                        break;
                    }
                    
                    listaTarefas.add(tarefa);
                    System.out.println("\nTarefa adicionada!");
                    System.out.println(tarefa.toString());
                break;
                case "2":
                    System.out.print("\nQual é a tarefa a ser concluída? ");
                    String tarefaConcluir = sc.nextLine();

                    if (listaTarefas.remove(tarefaConcluir)){
                        System.out.println("Tarefa concluída com sucesso");
                    } else {
                        System.out.println("Tarefa não existente");
                        System.out.println("Deseja adicionar ela? (sim, nao)");
                        String adicionarTarefa = sc.nextLine();
                        if (adicionarTarefa.equals("sim")) {
                            listaTarefas.add(tarefaConcluir);
                        } else {
                            break;
                        }
                    }
                break;
                case "3":
                System.out.println("\nBye");
                    terminarSistema = true;
                break;
                case "4":
                    System.out.println(listaTarefas.toString());
                break;
            }
        }
        sc.close();
    }

}
