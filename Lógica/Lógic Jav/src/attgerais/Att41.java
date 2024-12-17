/*Dado um vetor ordenado que pode conter números repetidos, modifique o algoritmo de busca binária para encontrar:

O primeiro índice do número.
O último índice do número. */

import java.util.*;

public class Att41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10};

        int inicio = 0, fim = numeros.length - 1, meio;
        boolean achou = false;

        System.out.println("Qual número você quer procurar?");
        int procurando = scanner.nextInt();

        int primeiroIndice = -1;
        int ultimoIndice = -1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (numeros[meio] < procurando) {
                inicio = meio + 1;
            } else if (numeros[meio] > procurando) {
                fim = meio - 1;
            } else {
                achou = true;
                primeiroIndice = meio;

                fim = meio - 1;
            }
        }

        inicio = 0;
        fim = numeros.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (numeros[meio] < procurando) {
                inicio = meio + 1;
            } else if (numeros[meio] > procurando) {
                fim = meio - 1;
            } else {
                achou = true;
                ultimoIndice = meio;

                inicio = meio + 1;
            }
        }

        if (achou) {
            System.out.println("O primeiro índice do número " + procurando + " é: " + primeiroIndice);
            System.out.println("O último índice do número " + procurando + " é: " + ultimoIndice);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
