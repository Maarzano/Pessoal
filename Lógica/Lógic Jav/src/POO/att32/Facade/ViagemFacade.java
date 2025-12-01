package att32.Facade;

import att32.Domain.HotelService;
import att32.Domain.PagamentoService;
import att32.Domain.VooService;

public class ViagemFacade {
    private VooService vooService;
    private HotelService hotelService;
    private PagamentoService pagamentoService;

    public ViagemFacade(VooService voo, HotelService hotel, PagamentoService pag) {
        this.vooService = voo;
        this.hotelService = hotel;
        this.pagamentoService = pag;
    }

    public void comprarPacote(String passageiro, String voo, String hotel, double valor) {
        try{
        System.out.println("\n--- Iniciando compra de pacote para " + passageiro + " ---");

        vooService.reservarAssento(voo, passageiro);
        hotelService.reservarQuarto(hotel, hotel);
        pagamentoService.processarPagamento(valor);

        } catch (RuntimeException e){
            System.out.println("Erro " + e);
            vooService.cancelarReserva(voo);
            hotelService.cancelarReserva(hotel);
            pagamentoService.estornarPagamento(valor);
        }
    }
}