public class Professor extends Usuario{
    public Professor(String nome){
        super(nome);
    }

    @Override
    public void pegarLivro(Livro livro){
        if (this.quantidadeLivrosPegos() == 5 || !livro.isDisponivel()){
            throw new RuntimeException("Professor só pode pegar no máximo 5 livros");
        } else {
            this.getLivros().add(livro);
            livro.emprestar();
        }
    }
}
