package att26.models;

import java.time.Duration;
import java.time.LocalDateTime;
import att26.contracts.ITarifaStrategy;
import att26.enums.ETipoVeiculo;

public class Ticket {
    private String id;
    private String placaVeiculo;
    private ETipoVeiculo tipoVeiculo;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private ITarifaStrategy tarifaStrategy;
    private double valorPago;

    public Ticket(String placa, ETipoVeiculo tipo, ITarifaStrategy tarifaStrategy) {
        this.id = java.util.UUID.randomUUID().toString();
        this.placaVeiculo = placa;
        this.tipoVeiculo = tipo;
        this.tarifaStrategy = tarifaStrategy;
        this.dataEntrada = LocalDateTime.now();
    }

    public void fecharTicket() {
        this.dataSaida = LocalDateTime.now();
        long minutos = Duration.between(dataEntrada, dataSaida).toMinutes();
        if (minutos == 0) minutos = 1; 
        
        this.valorPago = this.tarifaStrategy.calcular(minutos);
    }

    public String getPlacaVeiculo() { return placaVeiculo; }
    public double getValorPago() { return valorPago; }
    public LocalDateTime getDataSaida() { return dataSaida; }

}
