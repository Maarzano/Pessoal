package att33;

import att33.Factory.RelatorioFactory;
import att33.contracts.Relatorio;
import att33.enums.ETipoRelatorio;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = RelatorioFactory.gerarRelatorio(ETipoRelatorio.PDF);

        relatorio.gerar("TESTEE");
    }

}
