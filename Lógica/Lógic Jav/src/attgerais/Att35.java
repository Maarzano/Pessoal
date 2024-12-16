//busca binária
import java.util.*;
public class Att35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] números = {1, 5, 6, 8, 10, 24, 56};

        int inicio = 0;
        int fim = números.length -1;
        int meio = (inicio + fim) / 2;

        System.out.println("digite o número que quer procurar");
        int procura = scanner.nextInt();

        while (inicio <= fim){
            
            meio = (inicio + fim) / 2;

            if (procura == números[meio]){
                System.out.println("número " + procura + " encontrado no índice " + meio);
                break;
            } else if (procura > números[meio]){
                inicio = meio + 1;
            } else if (procura < números[meio]){
                fim = meio - 1;
            }

        }

        if (inicio > fim ) System.out.println("não encontrado");

        System.out.println("Lista: ");

        for (int percorre: números){
            System.out.print(percorre + " ");
        }
        scanner.close();
    }

}
