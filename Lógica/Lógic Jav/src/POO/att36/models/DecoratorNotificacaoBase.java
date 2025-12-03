package att36.models;

import att36.contracts.INotificador;

public abstract class DecoratorNotificacaoBase implements INotificador {
    INotificador notificador;

    public DecoratorNotificacaoBase(INotificador notificador){
        this.notificador = notificador;
    }

    @Override
    public void enviarNotificacao(String message){
        notificador.enviarNotificacao(message);
    }


}
