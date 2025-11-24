package att26.strategys;

import att26.contracts.ITarifaStrategy;

public class TarifaPorHora implements ITarifaStrategy {
    private double valorHora = 10.0;

    @Override
    public double calcular(long minutos) {
        return Math.ceil(minutos / 60.0) * valorHora;
    }
}
