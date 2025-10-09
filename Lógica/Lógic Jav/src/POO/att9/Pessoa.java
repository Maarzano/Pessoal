package att9;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String telefone;

    Pessoa(PessoaBuilder pessoaBuilder){
        this.nome = pessoaBuilder.nome;
        this.sobrenome = pessoaBuilder.sobrenome;
        this.idade = pessoaBuilder.idade;
        this.telefone = pessoaBuilder.telefone;
    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
    }

}
