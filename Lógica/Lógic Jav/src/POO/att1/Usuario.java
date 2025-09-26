import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livros;

    public Usuario (String nome){
        this.nome = nome;
        livros = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }
    public void pegarLivro(Livro livro){
        livros.add(livro);
        livro.emprestar();
    }
    public void devolverLivro(Livro livro){
        livros.remove(livro);
        livro.devolver();
    }

    public int quantidadeLivrosPegos(){
        return livros.size();
    }
    public ArrayList<Livro> getLivros(){
        return this.livros;
    }

}
