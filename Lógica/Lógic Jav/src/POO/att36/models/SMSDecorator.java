package att36.models;

import att36.contracts.INotificador;

public class SMSDecorator extends DecoratorNotificacaoBase {

    public SMSDecorator(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacao(String message){
        super.enviarNotificacao(message + " (ENVIANDO PELO SMS)");
    }

}
