import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class att21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarLoop = true;
        Stack<String> pilha = new Stack<>();
        Queue<String> fila = new LinkedList<>();
        int proximoCarro = 4;

        pilha.add("carro 1");
        pilha.add("carro 2");
        pilha.add("carro 3");

        System.out.println("Temos uma estacionamento com total de 3 vagas e atualmente elas estão cheias, você pode: ");
        
        while (continuarLoop){
            System.out.println("1. Liberar 1 vaga e chamar próximo\n2. Colocar carros na fila de espera\n3. Parar sistema");

            switch (sc.nextLine()) {

                case "1":
                    if (fila.isEmpty()){
                        System.out.println("\nNão há nenhum carro na fila de espera");
                        continue;
                    } else if (pilha.isEmpty()){
                        System.out.println("A garagem está vazia, entrando carro " + fila.peek());
                        pilha.add(fila.poll());
                    } else {
                        System.out.println("Carro saindo " + pilha.pop() + ", carro entrando " + fila.peek());
                        pilha.add(fila.poll());
                    }
                break;

                case "2":
                    System.out.println("Colocando carro na lista de espera" + proximoCarro);
                    fila.add("carro " + proximoCarro++);
                break;

                case "3":
                continuarLoop = false;
                continue;

                default:
                System.out.println("Opção inválida");
                break;
            }
        }
        sc.close();
    }

}
