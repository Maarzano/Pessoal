package att38.Models;

import att38.Contracts.INotificacao;

public class Email implements INotificacao {

    @Override
    public String enviar(String message, String destinatario) {
        return "Enviando por email: " + message + " para " + destinatario + "\n";
    }

}
