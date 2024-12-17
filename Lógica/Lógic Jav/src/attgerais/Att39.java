// implementando busca binária normal.
import java.util.*;
public class Att39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Digite o número que quer pesquisar...");
        int pesquisado = scanner.nextInt();
        
        int inicio = 0, finall = Vetor.length - 1, meio;
        boolean contem = false;
        int comparações = 0;


        while(inicio <= finall){

            comparações++;

            meio = (finall + inicio) / 2;

            if (Vetor[meio] > pesquisado){
                finall = meio -1;
            } else if (Vetor[meio] < pesquisado){
                inicio = meio +1;
            } else if (Vetor[meio] == pesquisado){
                System.out.println("seu número "+ pesquisado + " está no índex: " + meio);
                System.out.println("Comparações: " + comparações);
                contem = true;
                break;
            }
        }
        if (!contem){
            System.out.println("Seu número não se ecnontra na lista");
            System.out.println("Comparações: " + comparações);
        }
        scanner.close();
    }
}
