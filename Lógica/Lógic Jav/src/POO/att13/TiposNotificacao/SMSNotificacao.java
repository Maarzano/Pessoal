package att13.TiposNotificacao;

import att13.Abstracts.Notificacao;

public class SMSNotificacao extends Notificacao {
    @Override
    public void enviar(String meString){
        System.out.println("Enviando SMS " + meString);
    }
}
