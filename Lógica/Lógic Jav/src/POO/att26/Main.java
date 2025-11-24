package att26;

import java.util.ArrayList;
import java.util.List;

import att26.Service.EstacionamentoService;
import att26.contracts.ITicketRepository;
import att26.enums.ETipoVeiculo;
import att26.models.Vaga;
import att26.repository.MemoriaTicketRepository;
import att26.strategys.TarifaDiaria;
import att26.strategys.TarifaPorHora;

public class Main {
    public static void main(String[] args) {
        ITicketRepository repo = new MemoriaTicketRepository();
        
        List<Vaga> vagas = new ArrayList<>();
        vagas.add(new Vaga(1, ETipoVeiculo.CARRO));
        vagas.add(new Vaga(2, ETipoVeiculo.MOTO));

        EstacionamentoService service = new EstacionamentoService(repo, vagas);

        System.out.println("--- DIA 1 ---");
        
        service.registrarEntrada("ABC-1234", ETipoVeiculo.CARRO, new TarifaPorHora());
        
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        service.registrarSaida("ABC-1234");


        System.out.println("\n--- DIA 2 (Promoção) ---");
        
        service.registrarEntrada("XYZ-9876", ETipoVeiculo.CARRO, new TarifaDiaria());
        
        service.registrarSaida("XYZ-9876");
    }

}
