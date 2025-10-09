import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Helpers.Vetores;

public class att42 {
    public static void main(String[] args) {
        Integer[] vetor = Vetores.criarVetorInteiro(5);
        HashMap<Integer, List<Integer>> mapa = new HashMap<>();

        for (int n : vetor){
            int index = n % 3;
            mapa.putIfAbsent(index,new ArrayList<>());

            mapa.get(index).add(n);
        }
        System.out.println(mapa);
    }

}
