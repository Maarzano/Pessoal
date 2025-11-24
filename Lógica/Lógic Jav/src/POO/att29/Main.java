package att29;

public class Main {
    public static void main(String[] args) {
        Documento doc = new ProxyDocumentoConfidencial(
            new DocumentoConfidencial("/re/re/re/port.js"), 
            new Usuario("Arthur", Role.COMUM));

        doc.deletar();
        doc.ler();

    }
}
