public class Aluno extends Usuario{

    public Aluno(String nome){
        super(nome);
    }

    @Override
    public void pegarLivro(Livro livro){
        if (this.quantidadeLivrosPegos() == 3 || !livro.isDisponivel()){
            throw new RuntimeException("Aluno só pode pegar no máximo 3 livros");
        } else {
            this.getLivros().add(livro);
            livro.emprestar();
        }
    }
}
