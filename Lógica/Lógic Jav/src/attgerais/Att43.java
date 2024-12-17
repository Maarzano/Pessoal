/*Dado um vetor ordenado e um número X, utilize busca binária para encontrar o elemento mais próximo de X no vetor.
 Caso existam dois valores igualmente próximos, retorne o menor deles. */
import java.util.*;

public class Att43 {

    public static int encontrarElementoProximo(int[] vetor, int X) {
        int inicio = 0, fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == X) {

                return vetor[meio];
            } else if (vetor[meio] < X) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        int left = (inicio > 0) ? vetor[inicio - 1] : Integer.MAX_VALUE;
        int right = (inicio < vetor.length) ? vetor[inicio] : Integer.MAX_VALUE;

        if (Math.abs(left - X) <= Math.abs(right - X)) {
            return left;
        } else {
            return right;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17};

        System.out.print("Digite o número X para encontrar o elemento mais próximo: ");
        int X = scanner.nextInt();

        int elementoProximo = encontrarElementoProximo(vetor, X);

        System.out.println("O elemento mais próximo de " + X + " é: " + elementoProximo);
        scanner.close();
    }
}
