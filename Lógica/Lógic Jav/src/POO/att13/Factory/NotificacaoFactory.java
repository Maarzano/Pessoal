package att13.Factory;

import att13.Contracts.INotificacao;
import att13.Enums.ENotificacao;
import att13.TiposNotificacao.EmailNotificacao;
import att13.TiposNotificacao.PushNotificacao;
import att13.TiposNotificacao.SMSNotificacao;

public class NotificacaoFactory {
    public static INotificacao criarNotificacao(ENotificacao tipoNotificacao){
        switch (tipoNotificacao) {
            case EMAIL:
                return new EmailNotificacao();
            case SMS:
                return new SMSNotificacao();
            case PUSH:
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo errado!");
        }
    }

}
