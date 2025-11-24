package att29;

public class ProxyDocumentoConfidencial implements Documento {
    private Usuario user;
    private DocumentoConfidencial real;

    public ProxyDocumentoConfidencial(DocumentoConfidencial real, Usuario user){
        this.real = real;
        this.user = user;
    }
 

    @Override
    public void ler() {
        System.out.println("Lendo");
    }

    @Override
    public void deletar() {
        if (user.role == Role.ADMIN){
            System.out.println("DELETANDO");
            real.deletar();
        } else {
            System.out.println("NÂO PODE pois não é ADMIN");
        }
    }   

}
