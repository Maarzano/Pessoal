package att26.Service;

import java.util.List;

import att26.contracts.ITarifaStrategy;
import att26.contracts.ITicketRepository;
import att26.enums.ETipoVeiculo;
import att26.models.Ticket;
import att26.models.Vaga;

public class EstacionamentoService {
    
    private ITicketRepository ticketRepository;
    private List<Vaga> vagas;

    public EstacionamentoService(ITicketRepository repo, List<Vaga> vagasDisponiveis) {
        this.ticketRepository = repo;
        this.vagas = vagasDisponiveis;
    }

    public void registrarEntrada(String placa, ETipoVeiculo tipo, ITarifaStrategy regraCobranca) {
        Vaga vaga = vagas.stream()
                .filter(v -> v.isDisponivelPara(tipo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Estacionamento Lotado!"));

        vaga.ocupar();

        Ticket novoTicket = new Ticket(placa, tipo, regraCobranca);

        ticketRepository.salvar(novoTicket);
        
        System.out.println("Entrada registrada: " + placa + " na vaga " + vaga.getNumero());
    }

    public void registrarSaida(String placa) {
        Ticket ticket = ticketRepository.buscarPorPlaca(placa);
        if (ticket == null) throw new RuntimeException("Ticket não encontrado!");

        ticket.fecharTicket();
        
        ticketRepository.atualizar(ticket);

        vagas.forEach(v -> { /* logica para liberar vaga baseada no ID */ });

        System.out.println("Saída registrada. Valor a pagar: R$ " + ticket.getValorPago());
    }
}