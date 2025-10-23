package att13.TiposNotificacao;

import att13.Abstracts.Notificacao;

public class EmailNotificacao extends Notificacao {
    @Override
    public void enviar(String meString){
        System.out.println("Enviando email " + meString);
    }
}
