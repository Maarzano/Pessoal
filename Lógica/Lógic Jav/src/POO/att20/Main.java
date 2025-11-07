package att20;

public class Main {
    public static void main(String[] args) {
        TESTE t = new TESTE("TESTE1");
        TESTE tCopia = new TESTE(t);
        System.out.println(t.nomeTeste);
        System.out.println(tCopia.nomeTeste);

        tCopia.obj.nome = "MUDEI";


        System.out.println(t.obj.nome);
        System.out.println(tCopia.obj.nome);
    }

}
