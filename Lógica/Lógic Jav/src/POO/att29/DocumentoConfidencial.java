package att29;

public class DocumentoConfidencial implements Documento{
    public String nome;

    public DocumentoConfidencial(String nome){
        this.nome = nome;
    }

    @Override
    public void ler() {
        System.out.println("Lendo arquivo: " + this.nome);
    }

    @Override
    public void deletar() {
        System.out.println("Deletando arquivo: " + this.nome);
    }

}
