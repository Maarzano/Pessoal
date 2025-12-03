package att36.models;

import att36.contracts.INotificador;

public class WhatsappDecorator extends DecoratorNotificacaoBase {

    public WhatsappDecorator(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacao(String message){
        super.enviarNotificacao(message + " (ENVIANDO PELO Whatsapp)");
    }

}
