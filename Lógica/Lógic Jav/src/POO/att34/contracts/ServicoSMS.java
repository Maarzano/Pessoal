package att34.contracts;

public class ServicoSMS {
    public void enviarSMS(String numeroTelefone, String texto, int codigoPais){
        System.out.println("Enviando SMS para" + numeroTelefone + texto + codigoPais);
    }

}
