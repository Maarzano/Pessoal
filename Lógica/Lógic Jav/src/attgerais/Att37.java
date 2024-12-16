/*Implemente uma busca binária que retorna o índice do número mais próximo do valor target no vetor ordenado.*/
import java.util.*;
public class Att37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("qual o tamnho da lista?");
        int tamanholista = scanner.nextInt();
        for (int i = 0; i < tamanholista; i++) {
            System.out.println("insira números inteiros: ");
            int numeros = scanner.nextInt();
            lista.add(numeros);
        }

        for (int percorre : lista){
            System.out.print(percorre + " ");
        }

        System.out.println("\nDigite um número: ");
        int target = scanner.nextInt();

        int inicio = 0, fim = lista.size() - 1, meio;
        int melhorIndice = -1;
        int menorDiferenca = Integer.MAX_VALUE;

        while (inicio <= fim){
            meio = (inicio + fim) / 2;

            int diferenca = Math.abs(lista.get(meio) - target);

            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                melhorIndice = meio;
            }

            if (target == lista.get(meio)){
                System.out.println("Seu número está em " + meio);
                break;
            } else if(target < lista.get(meio)){
                fim = meio - 1;
            } else if (target > lista.get(meio)){
                inicio = meio + 1;
            }

        }
        System.out.println("Índice do número mais próximo: " + melhorIndice);
        System.out.println("Número mais próximo: " + lista.get(melhorIndice));

    scanner.close();
    }
}
