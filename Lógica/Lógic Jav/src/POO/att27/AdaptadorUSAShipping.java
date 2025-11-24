package att27;

public class AdaptadorUSAShipping implements ITransportadora {

    USAShippingService usa;

    public AdaptadorUSAShipping(USAShippingService usa){
        this.usa = usa;
    }

    @Override
    public void enviarPacote(double pesoEmKg, String destino) {
        
        double pesoEmLbs = pesoEmKg * 2.20462;

        usa.shipItem(pesoEmLbs, destino);
    }

}
