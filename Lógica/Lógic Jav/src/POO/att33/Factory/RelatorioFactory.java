package att33.Factory;

import att33.contracts.Relatorio;
import att33.enums.ETipoRelatorio;
import att33.models.RelatorioExcel;
import att33.models.RelatorioJson;
import att33.models.RelatorioPDF;

public class RelatorioFactory {

    private RelatorioFactory(){}

    
    public static Relatorio gerarRelatorio(ETipoRelatorio tipoRelatorio){
        switch (tipoRelatorio) {
            case EXCEL:
                return new RelatorioExcel();
            case JSON:
                return new RelatorioJson();
            case PDF:
                return new RelatorioPDF();
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }

}
