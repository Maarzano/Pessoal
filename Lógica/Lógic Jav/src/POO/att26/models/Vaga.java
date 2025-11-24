package att26.models;

import att26.enums.ETipoVeiculo;

public class Vaga {
    private int numero;
    private boolean ocupada;
    private ETipoVeiculo tamanhoSuportado;

    public Vaga(int numero, ETipoVeiculo tamanho) {
        this.numero = numero;
        this.tamanhoSuportado = tamanho;
        this.ocupada = false;
    }

    public boolean isDisponivelPara(ETipoVeiculo tipo) {
        if (this.ocupada) return false;
        if (this.tamanhoSuportado == ETipoVeiculo.CAMINHONETE && tipo != ETipoVeiculo.CAMINHONETE) return false;
        return true;
    }
    
    public void ocupar() { this.ocupada = true; }
    public void liberar() { this.ocupada = false; }
    public int getNumero() { return numero; }
}
