package att36.models;

import att36.contracts.INotificador;

public class Notificacao implements INotificador {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println(message);
    }

}
