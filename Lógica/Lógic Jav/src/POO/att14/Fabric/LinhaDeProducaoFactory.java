package att14.Fabric;

import att14.Models.Carro.CarroModel;

public abstract class LinhaDeProducaoFactory {

    public CarroModel produzirCarro() {
        System.out.println("Iniciando nova ordem de produção...");
        CarroModel carro = montarCarro();
        System.out.println("Carro ID " + carro.id + " finalizado na linha de produção.");
        return carro;
    }

    protected abstract CarroModel montarCarro();
}