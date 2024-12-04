
import java.util.*;
public class Att9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> pilha = new ArrayDeque<>();
        
        pilha.push("a linda noiva");
        pilha.push("o cavaleiro");
        pilha.push("o castelo");
        pilha.push("o chicote");
        pilha.push("transando a doidado");
        pilha.push("c# é um cu");
        pilha.push("toma no seu cu carai");
        pilha.push("a noiva viu meu pau");


        System.out.println("você tem "+ pilha.size() + " livros empilhados, deseja ir retirando os livro e vendo qual é o próximo?");
        char resposta = scanner.next().charAt(0);

        if (resposta == 's'){
            int tamanho = pilha.size();
            for (int i = 0;i< tamanho;i++){
                System.out.println(pilha.peek());
                pilha.pop();
            }


        } else {
            System.out.println("ok...");
        }
        scanner.close();
    }

}
