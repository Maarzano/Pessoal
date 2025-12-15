package att38.Decorators;

import att38.Contracts.INotificacao;

public abstract class NotificadorDecorator implements INotificacao {
    protected INotificacao notificador;

    public NotificadorDecorator(INotificacao notificador){
        this.notificador = notificador;
    }

    @Override
    public String enviar(String message, String destinatario){
        return notificador.enviar(message, destinatario);
    }

}
