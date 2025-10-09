import java.util.HashSet;
import java.util.Set;

import Helpers.Vetores;

public class att28 {
    public static void main(String[] args) {
        Integer[] lista = new Integer[]{1, 2, 3, 4, 5, 6, 7, 7, 7, 5, 3, 2, 2};

        System.out.println("Temos uma lista onde tem duplicatas: ");
        Vetores.mostrarVetor(lista);

        System.out.println("Agora vou mostrar sem as duplicatas");

        Set<Integer> conjunto = new HashSet<>();

        for (int numero : lista) conjunto.add(numero);

        for (int valor : conjunto) System.out.print(valor + " ");
       
    }

}
