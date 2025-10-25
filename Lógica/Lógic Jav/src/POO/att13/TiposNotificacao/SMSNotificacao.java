package att13.TiposNotificacao;

import att13.Contracts.INotificacao;

public class SMSNotificacao implements INotificacao {
    @Override
    public void enviar(String meString){
        System.out.println("Enviando SMS " + meString);
    }
}
