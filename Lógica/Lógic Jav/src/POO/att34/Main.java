package att34;

import att34.Adapter.AdaptadorSMS;
import att34.contracts.INotificador;
import att34.contracts.ServicoSMS;

public class Main {
    public static void main(String[] args) {
        ServicoSMS servicoLegado = new ServicoSMS();

        INotificador notificador = new AdaptadorSMS(servicoLegado);

        System.out.println("--- Testando Adapter ---");
        notificador.message("Seu pedido chegou!", "1199999-8888");
    }
}