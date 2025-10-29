package Revisao.att8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Produto> conjunto = new HashSet<>(List.of(new Produto("arthur", 0), new Produto("cerveja",123)));

        System.out.println(conjunto.add(new Produto("TESTE", 3)));
    }

}
