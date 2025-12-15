package att38.Decorators;

import att38.Contracts.INotificacao;

public class SlackDecorator extends NotificadorDecorator {

    public SlackDecorator(INotificacao notificador) {
        super(notificador);
    }

    @Override
    public String enviar(String message, String destinatario){
        return super.enviar(message, destinatario) + "Enviando pelo Slack: " + message + " para " + destinatario + "\n";
    }

}
