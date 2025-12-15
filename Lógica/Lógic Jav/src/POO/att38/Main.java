package att38;

import att38.Decorators.SlackDecorator;
import att38.Decorators.WhatsappDecorator;
import att38.Contracts.INotificacao;
import att38.Models.Email;

public class Main {
    public static void main(String[] args) {
        INotificacao notificador = new Email();
        notificador = new WhatsappDecorator(new SlackDecorator(notificador));

        System.out.println(notificador.enviar("AAAAA","Arthur"));


    }

}
