import java.util.LinkedList;
import java.util.Scanner;

public class att12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarLoop = true;
        LinkedList<String> lista = new LinkedList<>();
        while(continuarLoop){ 
            System.out.println("1. Adicionar pessoas na lista\n2. ver o 1° da lista\n3. ver o último da lista\n4. Sair");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    System.out.print("Escreva o nome da pessoa: ");
                    lista.add(sc.nextLine());
                break;
                case "2":
                    if (!lista.isEmpty()){
                        System.out.println(lista.getFirst());
                    } else {
                        System.out.println("A lista está vazia");
                    }
                    
                break;
                case "3":
                    if (!lista.isEmpty()){
                        System.out.println(lista.getLast());
                    } else {
                        System.out.println("A lista está vazia");
                    }
                break;
                case "4":
                    continuarLoop = false;
                break;
            
                default:
                    System.out.println("Opção errada tente novamente");
                    continue;
            }
        }
        sc.close();
    }

}
