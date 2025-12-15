package att38.Decorators;

import att38.Contracts.INotificacao;

public class WhatsappDecorator extends NotificadorDecorator {

    public WhatsappDecorator(INotificacao notificador) {
        super(notificador);
    }

    @Override
    public String enviar(String message, String destinatario){
        return super.enviar(message, destinatario) + "Enviando pelo Whatsapp: " + message + " para " + destinatario + "\n";
    }

}
