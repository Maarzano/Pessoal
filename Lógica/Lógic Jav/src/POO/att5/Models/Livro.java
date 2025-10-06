package att5.Models;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String isbn){
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void emprestar(){
        if (!disponivel) throw new IllegalStateException("Livro já está emprestado!");
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

    @Override
    public String toString(){
        return titulo + "(" + autor + ") - " + (disponivel ? "Disponível" : "Emprestado");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }

}
