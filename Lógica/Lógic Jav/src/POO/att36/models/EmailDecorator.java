package att36.models;

import att36.contracts.INotificador;

public class EmailDecorator extends DecoratorNotificacaoBase {

    public EmailDecorator(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacao(String message){
        super.enviarNotificacao(message + " (ENVIANDO PELO Email)");
    }

}
