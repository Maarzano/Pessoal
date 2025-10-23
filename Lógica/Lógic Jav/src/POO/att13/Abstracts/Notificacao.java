package att13.Abstracts;

import att13.Contracts.INotificacao;

public abstract class Notificacao implements INotificacao {
    @Override
    public void enviar(String menssagem){
        System.out.println("Enviando mensagem "+ menssagem); 
    }

}
