import java.util.HashMap;

import att41.Aluno;

public class att45 {
    public static void main(String[] args) {
        HashMap<Integer, Aluno> hash = new HashMap<>();

        hash.put(1234,new Aluno("arthur",0));

        Aluno aluno = hash.get(1234);

        System.out.println(aluno.getNome());

    }
}
