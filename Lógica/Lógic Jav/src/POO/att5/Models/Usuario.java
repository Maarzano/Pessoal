package att5.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected String matricula;
    protected List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String matricula){
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract int getLimiteLivros();
    public abstract int getPrazoDevolucaoDias();

    public void emprestarLivro(Livro livro) {
        if (livrosEmprestados.size() >= getLimiteLivros()) {
            throw new IllegalStateException("Limite de livros atingido!");
        }
        if (!livro.isDisponivel()) {
            throw new IllegalStateException("Livro indisponível!");
        }
        livro.emprestar();
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        if (!livrosEmprestados.contains(livro)) {
            throw new IllegalStateException("Livro não foi emprestado por este usuário!");
        }
        livro.devolver();
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    @Override
    public String toString() {
        return nome + " - " + matricula + " (" + this.getClass().getSimpleName() + ")";
    }

}
