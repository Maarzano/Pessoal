package att34.Adapter;

import att34.contracts.INotificador;
import att34.contracts.ServicoSMS;

public class AdaptadorSMS implements INotificador {
    ServicoSMS servicoSMS;

    public AdaptadorSMS(ServicoSMS servicoSMS){
        this.servicoSMS = servicoSMS;
    }

    @Override
    public void message(String mensagem, String destinatario) {
        servicoSMS.enviarSMS(destinatario, mensagem, 55);
    }

}
