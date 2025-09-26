public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void emprestar(){
        if (!disponivel) throw new RuntimeException("Livro indisponível para emprestimo");
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

}
