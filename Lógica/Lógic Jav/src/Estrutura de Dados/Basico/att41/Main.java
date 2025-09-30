package att41;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Aluno> mapa = new HashMap<>();

        Aluno aluno = new Aluno("arthur",10f);
        mapa.put(aluno.getNome(), aluno);

        System.out.println("Escreva o nome do aluno: ");
        Scanner sc = new Scanner(System.in);

        if(mapa.containsKey(sc.nextLine())){
            System.out.println("Seu aluno existe");
        }
    }

}
