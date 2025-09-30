import java.util.HashSet;

import Helpers.Vetores;

public class att40 {
    public static void main(String[] args) {
        int[] vetor = Vetores.criarVetorInteiro(5);

        HashSet<Integer> array = new HashSet<>();

        for (int i : vetor){
            array.add(i);
        }

        array.forEach(System.out::println);
    }

}
