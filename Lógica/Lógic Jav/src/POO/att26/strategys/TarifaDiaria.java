package att26.strategys;

import att26.contracts.ITarifaStrategy;

public class TarifaDiaria implements ITarifaStrategy {
    @Override
    public double calcular(long minutos) {
        return 50.0;
    }
}