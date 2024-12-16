/*Peça ao usuário um número e insira-o no vetor na posição correta para manter a ordem crescente.
 Use a lógica de busca binária para determinar onde ele deve ser inserido. */
import java.util.*;
public class Att36 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(8);
        lista.add(9);
        lista.add(11);
        lista.add(20);
        lista.add(56);
        lista.add(107);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista: ");

        for (int percorre : lista){
            System.out.print(percorre + " ");
        }

        System.out.println("\nqual número quer colocar na lista? ");
        int colocar = scanner.nextInt();

        int inicio = 0;
        int fim = lista.size() -1;
        int meio;
        int posição = -1;

        while (inicio <= fim){
            meio = (inicio + fim) / 2;

            if (colocar > lista.get(meio)){
                inicio = meio +1;
            } else if (colocar < lista.get(meio)){
                fim = meio -1;
            } else {
                System.out.println("já está na lista");
                posição = meio;
                break;
            }
        }

        if (posição == -1){
            posição = inicio;

            lista.add(posição, colocar);
        }

        for (int percorre : lista){
            System.out.print(percorre + " ");
        }
        scanner.close();
    }
}
