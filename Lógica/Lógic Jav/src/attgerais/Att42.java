/*Dado um vetor ordenado e um número X, utilize busca binária para encontrar a posição correta onde X deve ser inserido.
 Retorne o índice onde ele deve ser adicionado de modo que o vetor permaneça ordenado. */

import java.util.*;

public class Att42 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        lista.add(1);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.println("digite o número que deseja inserir: ");
        int numeroInserir = scanner.nextInt();

        int inicio = 0, fim = lista.size() - 1, meio;
        boolean achou = false;

        while (inicio <= fim){

            meio = (inicio + fim) /2;

            if (lista.get(meio) > numeroInserir) {
                fim = meio - 1;
            } else if (lista.get(meio) < numeroInserir){
                inicio = meio + 1;
            } else {
                achou = true;
            }
        }
        lista.add(inicio, numeroInserir);

        System.out.println("Lista atualizada: ");
        for (int percorre:lista){
            System.out.print(percorre + " ");
        }

    }
}
