package att9;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new PessoaBuilder().build();

        System.out.println(pessoa);
    }

}
