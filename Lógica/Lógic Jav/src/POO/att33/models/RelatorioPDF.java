package att33.models;

import att33.contracts.Relatorio;

public class RelatorioPDF implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório PDF: " + conteudo);
    }

}
