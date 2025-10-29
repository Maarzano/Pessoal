package att15;

import java.util.ArrayList;
import java.util.List;

public class Documento implements Cloneable {

    private String nome;
    private String autor;
    private List<String> paginas;
    
    public Documento(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = new ArrayList<>();
        this.paginas.add("PAGINA");
    }

    public Documento(Documento doc){
        this.autor = doc.autor;
        this.nome = doc.nome;
        this.paginas = new ArrayList<>(doc.paginas);
    }
    
    public void setNome(String nome) {this.nome = nome;}
    public void setAutor(String autor) {this.autor = autor;}
    public String getNome(){return this.nome;}
    public String getAutor(){return this.autor;}
    public List<String> getPaginas() {return paginas;}
    
    @Override
    public String toString() {
        return "Documento [nome=" + nome + ", autor=" + autor + "]";
    }

    @Override
    public Documento clone() {
        try {
            Documento o = (Documento) super.clone();
            o.paginas = new ArrayList<>(this.paginas);

            return o;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone não suportado? Impossível se implementamos Cloneable.");
        }
    }
}
