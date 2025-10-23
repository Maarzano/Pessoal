package att13;

import att13.Contracts.INotificacao;
import att13.Enums.ENotificacao;
import att13.Factory.NotificacaoFactory;

public class Main {
    public static void main(String[] args) {
        INotificacao notificacao = NotificacaoFactory.criarNotificacao(ENotificacao.EMAIL);
        notificacao.enviar("TESTANDO");
        notificacao = NotificacaoFactory.criarNotificacao(ENotificacao.SMS);
        notificacao.enviar("TESTTE @");
    }

}
