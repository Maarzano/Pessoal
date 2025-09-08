import java.util.LinkedList;
import java.util.Scanner;

public class att11 {
    public static void main(String[] args) {
        boolean continuarLoop = true;
        LinkedList<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (continuarLoop){
            System.out.println("1. adicionar cliente\n2. atender cliente\n3. ver quem é o próxima da fila\n4. Listar fila\n5. sair");
            String escolha = sc.nextLine();

            switch(escolha){
                case "1":
                    System.out.println("Quem deseja adicionar a fila? ");
                    String pessoa = sc.nextLine();
                    if (fila.contains(pessoa)) {
                        System.out.println("\nEssa essa pessoa já está na fila");
                        continue;
                    }
                        if (fila.add(pessoa)){
                            System.out.println("adicionada com sucesso!");
                        } else {
                            System.out.println("Deu algum B.O");
                        }
                break;
                case "2":
                    System.out.println("Cliente atendido: " + fila.remove());
                break;
                case "3":
                    System.out.println("Próximo da fila: " + fila.getFirst());
                break;
                case "4":
                    System.out.println(fila.toString());
                break;
                case "5":
                    continuarLoop = false;
                break;
                default:
                    System.out.println("Escolha errada tente de novo");
            }
        }
        sc.close();
    }
}
