package att33.models;

import att33.contracts.Relatorio;

public class RelatorioExcel implements Relatorio {

    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório Excel: " + conteudo);
    }

}
