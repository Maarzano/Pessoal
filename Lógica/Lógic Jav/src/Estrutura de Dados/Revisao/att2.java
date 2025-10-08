package Revisao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import Helpers.Vetores;

public class att2 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Escreva 5 números: ");
        int[] vetor = Vetores.criarVetorInteiro(5);

        Set<Integer> conjuntoSet = new HashSet<>();
        for (int num : vetor) {
            conjuntoSet.add(num);
        }

        System.out.println(isSubset(conjunto,conjuntoSet));
    }

    public static <T> boolean isSubset(Set<T> conjunto, Set<T> conjuntoTeste){
        for (T t : conjuntoTeste){
            if (!conjunto.contains(t)){
                return false;
            }
        }
        return true;
    }

}
