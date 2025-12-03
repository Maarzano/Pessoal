package att36;

import att36.contracts.INotificador;
import att36.models.DecoratorNotificacaoBase;
import att36.models.EmailDecorator;
import att36.models.Notificacao;
import att36.models.SMSDecorator;
import att36.models.WhatsappDecorator;

public class Main {
    public static void main(String[] args) {

        String texto = "TESTANDO";
        INotificador notificacao = new Notificacao();

        notificacao.enviarNotificacao(texto);

        notificacao = new SMSDecorator(notificacao);

        notificacao.enviarNotificacao(texto);

        notificacao = new WhatsappDecorator(notificacao);
        notificacao = new EmailDecorator(notificacao);

        notificacao.enviarNotificacao(texto);
    }

}
