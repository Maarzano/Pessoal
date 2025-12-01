package att32;

import att32.Domain.HotelService;
import att32.Domain.PagamentoService;
import att32.Domain.VooService;
import att32.Facade.ViagemFacade;

public class Main {
    public static void main(String[] args) {
        VooService voo = new VooService();
        HotelService hotel = new HotelService();
        PagamentoService pag = new PagamentoService();

        ViagemFacade clienteViagem = new ViagemFacade(voo, hotel, pag);

        clienteViagem.comprarPacote("João", "LATAM-123", "Copacabana Palace", 2500.00);


        clienteViagem.comprarPacote("Maria", "GOL-999", "Hotel California", 5000.00);
    }

}
